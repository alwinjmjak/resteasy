package org.jboss.resteasy.core.messagebody;

import java.io.ByteArrayOutputStream;

public class CustomByteArrayOutputStream extends ByteArrayOutputStream {

    public CustomByteArrayOutputStream() {
        super();
    }

    public byte[] getBytes() {
        return super.buf;
    }

    public int getCount() {
        return  super.count;
    }
}
