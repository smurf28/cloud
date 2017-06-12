package com.lhl.photo.util;

import java.io.InputStream;

import org.json.JSONException;

import com.qiniu.api.auth.AuthException;
import com.qiniu.api.auth.digest.Mac;
import com.qiniu.api.io.IoApi;
import com.qiniu.api.rs.PutPolicy;
import com.qiniu.api.rs.RSClient;

/**
 * ͼƬ�����ࣨʹ����ţ�ƴ洢����
 * @author www.shiyanlou.com
 *
 */
public class FileUtils {
    private static final String ACCESS_KEY = "9fkSwZpGekztl9K67i-6k76neV5tmHcNfp55MHkx";
    private static final String SECRET_KEY = "iMe8-b_ZhxafRmacI-ji8qBJ12XhZC5FfY6Ej37B";
    private static final String BUCKET_NAME = "lhl-space";//����������ţ�ƴ����� Bucket ����

    /**
     * �ϴ�ͼƬ����ţ�ƴ洢
     * @param reader
     * @param fileName
     */
    public static void upload(InputStream reader, String fileName) {
        String uptoken;
        try {
            Mac mac = new Mac(ACCESS_KEY, SECRET_KEY);
            PutPolicy putPolicy = new PutPolicy(BUCKET_NAME);
            uptoken = putPolicy.token(mac);
            IoApi.Put(uptoken, fileName, reader, null);
        } catch (AuthException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /**
     * ɾ����ţ�ƴ洢�ϵ�ͼƬ
     * @param key
     */
    public static void delete( String key) {
        Mac mac = new Mac(ACCESS_KEY, SECRET_KEY);
        RSClient client = new RSClient(mac);
        client.delete(BUCKET_NAME, key);
    }
}
