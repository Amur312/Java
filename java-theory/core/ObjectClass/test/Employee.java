import java.util.UUID;

public class Employee {
    private String name;
    private UUID id;

    public UUID getId() {
        return id;
    }

    public Employee(String name) {
        this.name = name;
        id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        if (obj == null) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {

    }
}
