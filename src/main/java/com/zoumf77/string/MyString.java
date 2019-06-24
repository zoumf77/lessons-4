package com.zoumf77.string;

import java.util.Arrays;



public class MyString  implements java.io.Serializable, Comparable<String>, CharSequence {
	    private final char value[];

	    /** Cache the hash code for the string */
	    private int hash; // Default to 0

	    /** use serialVersionUID from JDK 1.0.2 for interoperability */
	    private static final long serialVersionUID = -6849794470754667710L;
	    
	    
	    public MyString(MyString original) {
	        
	        this.value = original.value;
	        this.hash = original.hash;
	    }
	    public MyString(char value[]) {
	        this.value = Arrays.copyOf(value, value.length);
	    }
	    
	    
	    public MyString(char value[], int offset, int count) {
	        if (offset < 0) {
	            throw new StringIndexOutOfBoundsException(offset);
	        }
	        if (count <= 0) {
	            if (count < 0) {
	                throw new StringIndexOutOfBoundsException(count);
	            }
	            if (offset <= value.length) {
	                this.value = "".toCharArray();
	                return;
	            }
	        }
	        // Note: offset or count might be near -1>>>1.
	        if (offset > value.length - count) {
	            throw new StringIndexOutOfBoundsException(offset + count);
	        }
	        this.value = Arrays.copyOfRange(value, offset, offset+count);
	    }
	    
	    MyString(char[] value, boolean share) {
	        // assert share : "unshared not supported";
	        this.value = value;
	    }
	    
		@Override
		public char charAt(int index) {
			if ((index < 0) || (index >= value.length)) {
	            throw new StringIndexOutOfBoundsException(index);
	        }
	        return value[index];
		}

		
		public MyString concat(MyString str) {
	        int otherLen = str.length();
	        if (otherLen == 0) {
	            return this;
	        }
	        int len = value.length;
	        char buf[] = Arrays.copyOf(value, len + otherLen);
	        str.getChars(buf, len);
	        return new MyString(buf, true);
	    }
		
		 void getChars(char dst[], int dstBegin) {
		        System.arraycopy(value, 0, dst, dstBegin, value.length);
		  }
		 
		
		@Override
		public int length() {
			// TODO Auto-generated method stub
			return value.length;
		}

		@Override
		public CharSequence subSequence(int beginIndex, int endIndex) {
		
			        return this.substring(beginIndex, endIndex);
			
		}
		
		 public MyString substring(int beginIndex, int endIndex) {
		        if (beginIndex < 0) {
		            throw new StringIndexOutOfBoundsException(beginIndex);
		        }
		        if (endIndex > value.length) {
		            throw new StringIndexOutOfBoundsException(endIndex);
		        }
		        int subLen = endIndex - beginIndex;
		        if (subLen < 0) {
		            throw new StringIndexOutOfBoundsException(subLen);
		        }
		        return ((beginIndex == 0) && (endIndex == value.length)) ? this
		                : new MyString(value, beginIndex, subLen);
		    }
		 

		@Override
		public int compareTo(String arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
	    
		public static void main(String[] args){
			char[] abc={'a','b','c'};
			char[] def={'d','e','f'};
			MyString s=new MyString(abc);
			
			s.concat(new MyString(def));
			
			
		}
}
