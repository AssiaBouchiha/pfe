package ma.sir.obs.zynerator.security.common;

public interface SecurityParams {
    public static final String JWT_HEADER_NAME="Authorization";
    public static final String SECRET="e7db173f-6f92-4812-9d69-48de87bbcd12";
    public static final long EXPIRATION=86400000;
    public static final String HEADER_PREFIX="Bearer ";
}
