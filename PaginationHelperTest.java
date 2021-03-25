package QAProject;
public class PaginationHelperTest {

	public static void main(String[] args) {
		
		PaginationHelper p = new PaginationHelper (new Object[] {'a', 'b', 'c'},2);
		Character [] arr = {'a','b','c','d','e','f'};
		PaginationHelper h = new PaginationHelper(arr,4);
		
		System.out.println(h.pageCount()); //2
		System.out.println(h.itemCount()); //6
		System.out.println(h.PageItemCount(0)); //4
		System.out.println(h.PageItemCount(1)); //4
		System.out.println(h.pageIndex(5)); //1
		System.out.println(h.pageIndex(2)); //0
		System.out.println(h.pageIndex(20)); //-1
		System.out.println(h.pageIndex(-10)); //-1

	}

}
