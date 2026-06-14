package org.monani.noflix.service;


public interface IDataConverse {
    <T> T getData(String json, Class<T> Class);
}
