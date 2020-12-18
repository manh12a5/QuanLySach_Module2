public class BookManager {

    //Danh sách thuộc tính

    //Mảng tối đa 20 cuốn sách
    private Book bookList[] = new Book[20];

    //Danh sách phương thức

    public Book[] getBookList() {
        return bookList;
    }

    public void setBookList(Book[] bookList) {
        this.bookList = bookList;
    }

    //Thêm sách
    public void addNewBook(Book newBook) {
        //Kiểm tra xem đủ 20 quyển sách chưa
        //index ở đâu null thì sẽ thêm sách ở đó
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] == null) {
                bookList[i] = newBook;
                System.out.println("Thêm mới thành công");
                return;
            }
        }
        System.out.println("Thư viện đã đầy");
    }

    //Sửa sách
    public void editBookByIndex(int index, Book newBook) {
        //index nằm trong khoảng 0 - 19
        if (index < 20 && index >= 0) {
            //booklist tại index có null không?
            if (bookList[index] != null) {
                bookList[index] = newBook;
                System.out.println("Sửa thành công");
                return;
            }
        }
    }

    //Tìm max
    public int getMaxPrice() {
        int max = 0;
        for (Book b :
                bookList) {
            if (b != null) {
                if (b.getPrice() > max) {
                    max = b.getPrice();
                }
            }
        }
        return max;
    }

    //Tổng tiền
    public int getSumPrice() {
        int sumOfPrice = 0;
        for (Book b :
                bookList) {
            if (b != null) {
                sumOfPrice += b.getTotalPrice();
            }
        }
        return sumOfPrice;
    }

}