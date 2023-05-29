import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import {
  trigger,
  state,
  style,
  transition,
  animate,
} from '@angular/animations';
import { AppComponent } from './app.component';
import { AppMainComponent } from './app.main.component';

import { AuthService } from 'src/app/zynerator/security/Auth.service';
import { RoleService } from 'src/app/zynerator/security/Role.service';

@Component({
  selector: 'app-menu',
  templateUrl: './app.menu.component.html',
  animations: [
    trigger('inline', [
      state(
        'hidden',
        style({
          height: '0px',
          overflow: 'hidden',
        })
      ),
      state(
        'visible',
        style({
          height: '*',
        })
      ),
      state(
        'hiddenAnimated',
        style({
          height: '0px',
          overflow: 'hidden',
        })
      ),
      state(
        'visibleAnimated',
        style({
          height: '*',
        })
      ),
      transition(
        'visibleAnimated => hiddenAnimated',
        animate('400ms cubic-bezier(0.86, 0, 0.07, 1)')
      ),
      transition(
        'hiddenAnimated => visibleAnimated',
        animate('400ms cubic-bezier(0.86, 0, 0.07, 1)')
      ),
    ]),
  ],
})
export class AppMenuComponent implements OnInit {
  model: any[];
  modelsuperadmin:any[];
  modelanonymous: any[];
    modeladmin : any[];
  constructor(public app: AppComponent,
   public appMain: AppMainComponent,
   private roleService: RoleService,
   private authService:AuthService,
  private router: Router) {}

  ngOnInit() {


    this.modeladmin =
      [
              {
                label: 'Gestion Config',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste gender',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/config/gender/list']
                    },
                    {
                      label: 'Liste department',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/config/department/list']
                    },
                    {
                      label: 'Liste age category',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/config/age-category/list']
                    },
                    {
                      label: 'Liste location type',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/config/location-type/list']
                    },
                    {
                      label: 'Liste market category',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/config/market-category/list']
                    },
                ]
              },
              {
                label: 'Gestion Antibiotic',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste antibiotic',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/antibiotic/antibiotic/list']
                    },
                ]
              },
              {
                label: 'Gestion DataAnalysis',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste data analysis',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/dataanalysis/data-analysis/list']
                    },
                ]
              },
              {
                label: 'Gestion DataArchive',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste report',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/dataarchive/report/list']
                    },
                    {
                      label: 'Liste data archive',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/dataarchive/data-archive/list']
                    },
                ]
              },
              {
                label: 'Gestion Microbiology',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste microbiology',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/microbiology/microbiology/list']
                    },
                ]
              },
              {
                label: 'Notification',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste notification',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/notification/notification/list']
                    },
                ]
              },
              {
                label: 'Gestion Organism',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste sero type',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/organism/sero-type/list']
                    },
                    {
                      label: 'Liste organism',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/organism/organism/list']
                    },
                ]
              },
              {
                label: 'Gestion Laboratory',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste laboratory',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/laboratory/laboratory/list']
                    },
                ]
              },
              {
                label: 'Gestion Animal',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste animal',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/animal/animal/list']
                    },
                    {
                      label: 'Liste animal type',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/animal/animal-type/list']
                    },
                    {
                      label: 'Liste animal specie',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/animal/animal-specie/list']
                    },
                ]
              },
              {
                label: 'Gestion Plant',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste plant',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/plant/plant/list']
                    },
                ]
              },
              {
                label: 'Gestion Alert',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste alert',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alert/alert/list']
                    },
                ]
              },
              {
                label: 'Gestion Environment',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste environment',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/environment/environment/list']
                    },
                ]
              },
              {
                label: 'Gestion Patient',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste patient',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/patient/patient/list']
                    },
                ]
              },
              {
                label: 'Gestion LocationData',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste location data',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/locationData/location-data/list']
                    },
                ]
              },
              {
                label: 'Gestion Food',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste food',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/food/food/list']
                    },
                    {
                      label: 'Liste brand',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/food/brand/list']
                    },
                    {
                      label: 'Liste institution',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/food/institution/list']
                    },
                ]
              },
              {
                label: 'Gestion Specimen',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste specimen',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/specimen/specimen/list']
                    },
                    {
                      label: 'Liste reason',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/specimen/reason/list']
                    },
                ]
              },
              {
                label: 'Gestion Location',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste location',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/location/location/list']
                    },
                ]
              },
    ]
        if (this.authService.authenticated) {
      if (this.authService.authenticatedUser.roles) {

        this.authService.authenticatedUser.roles.forEach(role => {
          const roleName: string = this.getRole(role);
          this.roleService._role.next(roleName.toUpperCase());
          eval('this.model = this.model' + this.getRole(role));
        })
      }

    }
  }
  getRole(text){
  const [role, ...rest] = text.split('_');
  return rest.join('').toLowerCase();
}
  onMenuClick(event) {
    this.appMain.onMenuClick(event);
  }
}
