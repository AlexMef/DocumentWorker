public class DocumentWorker {

    DocumentWorker(){
        openDocument();
        editDocument();
        saveDocument();
        System.out.println("Вызван конструктор DocumentWorker");
    }

    public void openDocument(){
        System.out.println("Документ открыт");
    }

    public void editDocument(){
        System.out.println("Редактирование доступно только в версии PRO");
    }

    public void saveDocument(){
        System.out.println("Сохранение доступно только в версии PRO");
    }
}
