package QAProject;

public class PaginationHelper {

	int valuecount;
	int maxOnPage;
	int pages;
	
	public PaginationHelper (Object [] values, int maxx) {
		valuecount = values.length;
		maxOnPage = maxx;
		int i = valuecount;
		pages = 0;
		
		while (i > 0) {
			i -= maxx;
			pages++;
		}
		
	}
	
	public int pageCount() {
		return pages;
	}
	
	public int itemCount() {
		return valuecount;
	}
	public int PageItemCount(int page) {
		if (page < pages ) return maxOnPage;
		return -1;
	}
	public int pageIndex(int itemdx) {
		if ((itemdx < 0 ) || (itemdx > valuecount)) return -1;
		return itemdx/maxOnPage;
	}

}

