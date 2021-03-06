package com.roslib.smach_msgs;

import java.lang.*;

public class SmachContainerStatus implements com.roslib.ros.Msg {
    public com.roslib.std_msgs.Header header;
    public java.lang.String path;
    public java.lang.String[] initial_states;
    public java.lang.String[] active_states;
    public java.lang.String local_data;
    public java.lang.String info;

    public SmachContainerStatus() {
        this.header = new com.roslib.std_msgs.Header();
        this.path = "";
        this.initial_states = null;
        this.active_states = null;
        this.local_data = "";
        this.info = "";
    }

    public int serialize(byte[] outbuffer, int start) {
        int offset = start;
        offset = this.header.serialize(outbuffer, offset);
        int length_path = this.path.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_path >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_path >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_path >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_path >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_path; k++) {
            outbuffer[offset + k] = (byte)((this.path.getBytes())[k] & 0xFF);
        }
        offset += length_path;
        int length_initial_states = this.initial_states != null ? this.initial_states.length : 0;
        outbuffer[offset + 0] = (byte)((length_initial_states >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_initial_states >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_initial_states >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_initial_states >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_initial_states; i++) {
            int length_initial_statesi = this.initial_states[i].getBytes().length;
            outbuffer[offset + 0] = (byte)((length_initial_statesi >> (8 * 0)) & 0xFF);
            outbuffer[offset + 1] = (byte)((length_initial_statesi >> (8 * 1)) & 0xFF);
            outbuffer[offset + 2] = (byte)((length_initial_statesi >> (8 * 2)) & 0xFF);
            outbuffer[offset + 3] = (byte)((length_initial_statesi >> (8 * 3)) & 0xFF);
            offset += 4;
            for (int k=0; k<length_initial_statesi; k++) {
                outbuffer[offset + k] = (byte)((this.initial_states[i].getBytes())[k] & 0xFF);
            }
            offset += length_initial_statesi;
        }
        int length_active_states = this.active_states != null ? this.active_states.length : 0;
        outbuffer[offset + 0] = (byte)((length_active_states >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_active_states >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_active_states >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_active_states >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int i = 0; i < length_active_states; i++) {
            int length_active_statesi = this.active_states[i].getBytes().length;
            outbuffer[offset + 0] = (byte)((length_active_statesi >> (8 * 0)) & 0xFF);
            outbuffer[offset + 1] = (byte)((length_active_statesi >> (8 * 1)) & 0xFF);
            outbuffer[offset + 2] = (byte)((length_active_statesi >> (8 * 2)) & 0xFF);
            outbuffer[offset + 3] = (byte)((length_active_statesi >> (8 * 3)) & 0xFF);
            offset += 4;
            for (int k=0; k<length_active_statesi; k++) {
                outbuffer[offset + k] = (byte)((this.active_states[i].getBytes())[k] & 0xFF);
            }
            offset += length_active_statesi;
        }
        int length_local_data = this.local_data.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_local_data >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_local_data >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_local_data >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_local_data >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_local_data; k++) {
            outbuffer[offset + k] = (byte)((this.local_data.getBytes())[k] & 0xFF);
        }
        offset += length_local_data;
        int length_info = this.info.getBytes().length;
        outbuffer[offset + 0] = (byte)((length_info >> (8 * 0)) & 0xFF);
        outbuffer[offset + 1] = (byte)((length_info >> (8 * 1)) & 0xFF);
        outbuffer[offset + 2] = (byte)((length_info >> (8 * 2)) & 0xFF);
        outbuffer[offset + 3] = (byte)((length_info >> (8 * 3)) & 0xFF);
        offset += 4;
        for (int k=0; k<length_info; k++) {
            outbuffer[offset + k] = (byte)((this.info.getBytes())[k] & 0xFF);
        }
        offset += length_info;
        return offset;
    }

    public int deserialize(byte[] inbuffer, int start) {
        int offset = start;
        offset = this.header.deserialize(inbuffer, offset);
        int length_path = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_path |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_path |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_path |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_path = new byte[length_path];
        for(int k= 0; k< length_path; k++){
            bytes_path[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.path = new java.lang.String(bytes_path);
        offset += length_path;
        int length_initial_states = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_initial_states |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_initial_states |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_initial_states |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_initial_states > 0) {
            this.initial_states = new java.lang.String[length_initial_states];
        }
        for (int i = 0; i < length_initial_states; i++) {
            int length_initial_statesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
            length_initial_statesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
            length_initial_statesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
            length_initial_statesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
            offset += 4;
            byte[] bytes_initial_statesi = new byte[length_initial_statesi];
            for(int k= 0; k< length_initial_statesi; k++){
                bytes_initial_statesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
            }
            this.initial_states[i] = new java.lang.String(bytes_initial_statesi);
            offset += length_initial_statesi;
        }
        int length_active_states = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_active_states |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_active_states |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_active_states |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        if(length_active_states > 0) {
            this.active_states = new java.lang.String[length_active_states];
        }
        for (int i = 0; i < length_active_states; i++) {
            int length_active_statesi = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
            length_active_statesi |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
            length_active_statesi |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
            length_active_statesi |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
            offset += 4;
            byte[] bytes_active_statesi = new byte[length_active_statesi];
            for(int k= 0; k< length_active_statesi; k++){
                bytes_active_statesi[k] = (byte)(inbuffer[k + offset] & 0xFF);
            }
            this.active_states[i] = new java.lang.String(bytes_active_statesi);
            offset += length_active_statesi;
        }
        int length_local_data = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_local_data |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_local_data |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_local_data |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_local_data = new byte[length_local_data];
        for(int k= 0; k< length_local_data; k++){
            bytes_local_data[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.local_data = new java.lang.String(bytes_local_data);
        offset += length_local_data;
        int length_info = (int)((inbuffer[offset + 0] & 0xFF) << (8 * 0));
        length_info |= (int)((inbuffer[offset + 1] & 0xFF) << (8 * 1));
        length_info |= (int)((inbuffer[offset + 2] & 0xFF) << (8 * 2));
        length_info |= (int)((inbuffer[offset + 3] & 0xFF) << (8 * 3));
        offset += 4;
        byte[] bytes_info = new byte[length_info];
        for(int k= 0; k< length_info; k++){
            bytes_info[k] = (byte)(inbuffer[k + offset] & 0xFF);
        }
        this.info = new java.lang.String(bytes_info);
        offset += length_info;
        return offset;
    }

    public int serializedLength() {
        int length = 0;
        length += this.header.serializedLength();
        int length_path = this.path.getBytes().length;
        length += 4;
        length += length_path;
        length += 4;
        int length_initial_states = this.initial_states != null ? this.initial_states.length : 0;
        for (int i = 0; i < length_initial_states; i++) {
            int length_initial_statesi = this.initial_states[i].getBytes().length;
            length += 4;
            length += length_initial_statesi;
        }
        length += 4;
        int length_active_states = this.active_states != null ? this.active_states.length : 0;
        for (int i = 0; i < length_active_states; i++) {
            int length_active_statesi = this.active_states[i].getBytes().length;
            length += 4;
            length += length_active_statesi;
        }
        int length_local_data = this.local_data.getBytes().length;
        length += 4;
        length += length_local_data;
        int length_info = this.info.getBytes().length;
        length += 4;
        length += length_info;
        return length;
    }

    public java.lang.String echo() { return ""; }
    public java.lang.String getType(){ return "smach_msgs/SmachContainerStatus"; }
    public java.lang.String getMD5(){ return "3e74cf72da18311be27e7a5970ea6415"; }
    public long getID() { return 0; }
    public void setID(long id) { }
}
