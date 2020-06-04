// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import sun.util.logging.PlatformLogger;
public class XGraphicsExposeEvent extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 72; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XGraphicsExposeEvent(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XGraphicsExposeEvent() {
		log.finest("Creating");
		pData = unsafe.allocateMemory(getSize());
		should_free_memory = true;
	}


	public void dispose() {
		log.finest("Disposing");
		if (should_free_memory) {
			log.finest("freeing memory");
			unsafe.freeMemory(pData); 
	}
		}
	public int get_type() { log.finest("");return (Native.getInt(pData+0)); }
	public void set_type(int v) { log.finest(""); Native.putInt(pData+0, v); }
	public long get_serial() { log.finest("");return (Native.getLong(pData+8)); }
	public void set_serial(long v) { log.finest(""); Native.putLong(pData+8, v); }
	public boolean get_send_event() { log.finest("");return (Native.getBool(pData+16)); }
	public void set_send_event(boolean v) { log.finest(""); Native.putBool(pData+16, v); }
	public long get_display() { log.finest("");return (Native.getLong(pData+24)); }
	public void set_display(long v) { log.finest(""); Native.putLong(pData+24, v); }
	public long get_drawable() { log.finest("");return (Native.getLong(pData+32)); }
	public void set_drawable(long v) { log.finest(""); Native.putLong(pData+32, v); }
	public int get_x() { log.finest("");return (Native.getInt(pData+40)); }
	public void set_x(int v) { log.finest(""); Native.putInt(pData+40, v); }
	public int get_y() { log.finest("");return (Native.getInt(pData+44)); }
	public void set_y(int v) { log.finest(""); Native.putInt(pData+44, v); }
	public int get_width() { log.finest("");return (Native.getInt(pData+48)); }
	public void set_width(int v) { log.finest(""); Native.putInt(pData+48, v); }
	public int get_height() { log.finest("");return (Native.getInt(pData+52)); }
	public void set_height(int v) { log.finest(""); Native.putInt(pData+52, v); }
	public int get_count() { log.finest("");return (Native.getInt(pData+56)); }
	public void set_count(int v) { log.finest(""); Native.putInt(pData+56, v); }
	public int get_major_code() { log.finest("");return (Native.getInt(pData+60)); }
	public void set_major_code(int v) { log.finest(""); Native.putInt(pData+60, v); }
	public int get_minor_code() { log.finest("");return (Native.getInt(pData+64)); }
	public void set_minor_code(int v) { log.finest(""); Native.putInt(pData+64, v); }


	String getName() {
		return "XGraphicsExposeEvent"; 
	}


	String getFieldsAsString() {
		StringBuilder ret = new StringBuilder(480);

		ret.append("type = ").append( XlibWrapper.eventToString[get_type()] ).append(", ");
		ret.append("serial = ").append( get_serial() ).append(", ");
		ret.append("send_event = ").append( get_send_event() ).append(", ");
		ret.append("display = ").append( get_display() ).append(", ");
		ret.append("drawable = ").append( get_drawable() ).append(", ");
		ret.append("x = ").append( get_x() ).append(", ");
		ret.append("y = ").append( get_y() ).append(", ");
		ret.append("width = ").append( get_width() ).append(", ");
		ret.append("height = ").append( get_height() ).append(", ");
		ret.append("count = ").append( get_count() ).append(", ");
		ret.append("major_code = ").append( get_major_code() ).append(", ");
		ret.append("minor_code = ").append( get_minor_code() ).append(", ");
		return ret.toString();
	}


}



