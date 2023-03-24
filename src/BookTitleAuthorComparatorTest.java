import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BookTitleAuthorComparatorTest {
  public BookTitleAuthorComparator bookComp = new BookTitleAuthorComparator();

  @Test
  public void AuthorsTitlesEqual() {
    Book a = new Book("a", "b", 5);
    Book b = new Book("a", "b", 6);
    assertEquals(0, bookComp.compare(a, b));
  }

  @Test
  public void AuthorsDiffTitles() {
    Book a = new Book("a", "b", 5);
    Book b = new Book("b", "b", 6);
    assertTrue(bookComp.compare(a, b) < 0);
    assertTrue(bookComp.compare(b, a) > 0);
  }

  @Test
  public void AuthorsEqTitlesDiff() {
    Book a = new Book("a", "a", 5);
    Book b = new Book("a", "b", 6);
    assertTrue(bookComp.compare(a, b) < 0);
    assertTrue(bookComp.compare(b, a) > 0);
  }

  @Test
  public void AuthorsDiffTitlesDiff() {
    Book a = new Book("a", "b", 5);
    Book b = new Book("b", "b", 6);
    assertTrue(bookComp.compare(a, b) < 0);
    assertTrue(bookComp.compare(b, a) > 0);
  }
}

