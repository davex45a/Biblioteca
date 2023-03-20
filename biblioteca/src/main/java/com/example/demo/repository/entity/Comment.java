@Entity
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String content;

	// Otros atributos y métodos getter/setter

	@ManyToOne
	@JoinColumn(name = "post_id")
	private Post post;

	@OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
	private List<Comment> replies = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "parent_id")
	private Comment parent;
}
