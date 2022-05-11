public class LuzesDeNatal extends ArvoreDecorator {

    public LuzesDeNatal(ArvoreDeNatal arvore) {
        super(arvore);
    }

    public String decorar() {
        return super.decorar() + decorarComLuzesDeNatal();
    }

    private String decorarComLuzesDeNatal() {
        return " com luzes de natal";
    }
}
