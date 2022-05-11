public class Enfeites  extends ArvoreDecorator {

    public Enfeites(ArvoreDeNatal arvore) {
        super(arvore);
    }

    public String decorar() {
        return super.decorar() + decorarComEnfeites();
    }

    private String decorarComEnfeites() {
        return " com enfeites";
    }
}