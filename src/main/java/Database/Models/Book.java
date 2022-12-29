package Database.Models;

import lombok.*;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    public String isbn;
    public String title;
    public Date publication_year;
    public Float price;
    public String category;
    public int minimum_stock;
    public int stock;
    public String publisher_name;

    public Book(ResultSet set) throws SQLException {
        this.isbn = set.getString(1);
        this.title = set.getString(2);
        this.publication_year = set.getDate(3);
        this.price = set.getFloat(4);
        this.category = set.getString(5);
        this.minimum_stock = set.getInt(6);
        this.stock = set.getInt(7);
        this.publisher_name = set.getString(8);
    }

    @Override
    public String toString() {
        return "('" + this.isbn + "','" +
                this.title + "','" +
                this.publication_year + "','" +
                this.price + "','" +
                this.category + "','" +
                this.minimum_stock + "','" +
                this.stock + "','" +
                this.publisher_name + "'" +
                ")";
    }
}