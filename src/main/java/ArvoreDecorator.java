public abstract class ArvoreDecorator implements ArvoreDeNatal {
    private ArvoreDeNatal arvore;

    public ArvoreDecorator(ArvoreDeNatal arvore) {
        this.arvore = arvore;
    }

    public ArvoreDeNatal getArvore() {
        return arvore;
    }

    public void setArvore(ArvoreDeNatal arvore) {
        this.arvore = arvore;
    }

    @Override
    public String decorar() {
        return arvore.decorar();
    }
}
