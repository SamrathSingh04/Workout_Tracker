@Entity
@Table(name = "users")
@Data // From Lombok: generates getters/setters
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password; // This will store the BCrypt hash

    private String name;
}