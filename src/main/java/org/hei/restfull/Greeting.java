package org.hei.restfull;
import java.util.Objects;

public class Greeting {
    private long id;
    private String content;

    public Greeting( long id,String content) {
        this.content = content;
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Greeting that)) return false;
        return getId() == that.getId() && Objects.equals(getContent(), that.getContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getContent());
    }

    @Override
    public String toString() {
        return "Representation{" +
                "content='" + content + '\'' +
                ", id=" + id +
                '}';
    }
}
