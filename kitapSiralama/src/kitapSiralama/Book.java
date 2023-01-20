package kitapSiralama;

public class Book implements  Comparable<Book> {

    private final String name;
    private final int pageNum;
    private final String writerName;
    private final int publishDate;

    public Book(String name, int pageNum, String writerName, int publishDate) {
        this.name = name;
        this.pageNum = pageNum;
        this.writerName = writerName;
        this.publishDate = publishDate;
    }


    public String getName() {
        return name;
    }

    public int getPageNum() {
        return pageNum;
    }

    public String getWriterName() {
        return writerName;
    }

    public int getPublishDate() {
        return publishDate;
    }


	@Override
	public int compareTo(Book o) {
		return getName().compareTo(o.getName());
	}

}