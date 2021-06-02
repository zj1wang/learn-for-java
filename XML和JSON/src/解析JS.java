public class 解析JS {

}
public class Book{
    public String name;
    @JsonDeserialize(using = IsbnDeserializer.class)
    public LocalDate pubDate;
}
