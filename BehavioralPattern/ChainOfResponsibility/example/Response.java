class Response {
	private String message;
	public Response(String message) {
		System.out.println("处理完请求");
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}