package unimelb.webdav.client;

public interface OwnCloudClient extends WebDAVClient {

    public static final String OC_CHUNKED_HEADER = "OC-Chunked";

    public static final int DEFAULT_CHUNK_SIZE = 0;

    long chunkSize();

}
