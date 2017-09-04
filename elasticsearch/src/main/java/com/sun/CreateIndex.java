package com.sun;

import org.elasticsearch.action.admin.indices.create.CreateIndexRequestBuilder;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;

import java.io.IOException;
import java.net.InetAddress;

public class CreateIndex {
    public static void main(String[] args) throws IOException {
        TransportClient client = TransportClient.builder().build().addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9300));//建立链接
        CreateIndexRequestBuilder cib = client.admin().indices().prepareCreate("estest");

        XContentBuilder mapping = XContentFactory.jsonBuilder()
                .startObject()
                .startObject("properties") //设置之定义字段

                .startObject("id")//字段id
                .field("type", "text")//设置数据类型
                .field("index", "not_analyzed")
                .endObject()

                .startObject("accountName")
                .field("type", "text")
                .field("index", "not_analyzed")
                .endObject()

                .startObject("nickName")
                .field("type", "text")
                .field("index", "not_analyzed")
                .endObject()

                .endObject().endObject();

        cib.addMapping("accountinfo", mapping);
        cib.execute().actionGet();
    }
}
