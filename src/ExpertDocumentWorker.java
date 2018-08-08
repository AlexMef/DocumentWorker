public class ExpertDocumentWorker extends ProDocumentWorker {

    ExpertDocumentWorker(){
        openDocument();
        editDocument();
        saveDocument();
        System.out.println("Вызван конструктор ExpertDocumentWorker");
    }

    @Override
    public void openDocument() {
        super.openDocument();
    }

    @Override
    public void editDocument() {
        super.editDocument();
    }

    @Override
    public void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}
