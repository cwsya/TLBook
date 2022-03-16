package org.cwsya.tlbook.util;

import java.io.File;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.region.Region;

@Component
public class CosUtil {

  @Value("${COS.secretId}")
  private String secretId;
  @Value("${COS.secretKey}")
  private String secretKey;
  @Value("${COS.appId}")
  private String appId;
  @Value("${COS.bucketName}")
  private String bucketName;
  @Value("${COS.region}")
  private String region;
  @Value("${COS.url}")
  private String url;
  @Value("${COS.prefix}")
  private String prefix;

 
  private COSClient init() {
    COSCredentials cred = new BasicCOSCredentials(secretId,secretKey);
    Region region1 = new Region(region);
    ClientConfig clientConfig = new ClientConfig(region1);
    return new COSClient(cred, clientConfig);
  }

  public void upload(String pathAndName, File file) {
    COSClient cosClient = init();
    try {
      cosClient.putObject(bucketName,prefix + pathAndName, file);
    } finally {
      cosClient.shutdown();
    }
  }

}