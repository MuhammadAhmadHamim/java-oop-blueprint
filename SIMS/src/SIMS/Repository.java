package SIMS;

/**
 *
 * @author mahmad
 */
public interface Repository<R>{
    public void add(R r1);
    public void update(R r1);
    public void delete(R r1);
    public void getAll();
    public void getById(int i);
}
