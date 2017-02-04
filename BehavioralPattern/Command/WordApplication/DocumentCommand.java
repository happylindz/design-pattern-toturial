abstract class DocumentCommand {
	protected Document doc;
	public DocumentCommand(Document doc) {
		this.doc = doc;
	}
	public abstract void execute();
}

class CloseCommand extends DocumentCommand {
	public CloseCommand(Document doc) {
		super(doc);
	}
	public void execute() {
		doc.close();
	}
}

class OpenCommand extends DocumentCommand {
	public OpenCommand(Document doc) {
		super(doc);
	}
	public void execute() {
		doc.open();
	}
}

class CopyCommand extends DocumentCommand {
	public CopyCommand(Document doc) {
		super(doc);
	}
	public void execute() {
		doc.copy();
	}
}

class PasteCommand extends DocumentCommand {
	public PasteCommand(Document doc) {
		super(doc);
	}
	public void execute() {
		doc.paste();
	}
}
