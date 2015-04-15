**
 * ID: U10316023 
 * Ex: 11.10 
 * Information:
 *		MyStack class was on page 462. 
 *	  Implement MyStack by using inheritance.
 */

// implement it by using inheritance
class MyStack extends java.util.ArrayList<Object> {
	// the codes under this line were listed on page 462 
	public boolean isEmpty() {
		return super.isEmpty();
	}

	public int getSize() {
		return size();
  }

	public Object peek() {
		return get(getSize() - 1);
  }

	public Object pop() {
		Object o = get(getSize() - 1);
		remove(getSize() - 1);
		return o;
	}

	public Object push(Object o) {
		add(o);
		return o;
	}

	public int search(Object o) {
		return indexOf(o);
	}

	@Override
	public String toString() {
		//didn't need to write list.toString()  because list wasn't exist
		return "stack: " + toString();
	}
}
