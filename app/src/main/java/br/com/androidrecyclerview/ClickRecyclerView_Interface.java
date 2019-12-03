package br.com.androidrecyclerview;

public interface ClickRecyclerView_Interface {
    @Override
    public void onCustomClick(Object object) {

        Pessoa pessoa = (Pessoa) object;
        String nome = pessoa.getNome();

        //aqui você poderá fazer algo com este objeto como por exemplo, enviar os dados para
        //outra activity e chamá-la.
    }
}
