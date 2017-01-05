abstract class Handler {
	private Handler nextHandler = null;
	public void setNextHandler(Handler handler) {
		nextHandler = handler;
	}
	public final Response handlerRequest(Request request) {
		Response response = null;
		if(this.getHandlerLevel().above(request.getLevel())) {
			response = this.response(request);
		}else {
			if(nextHandler != null) {
				response = this.nextHandler.handlerRequest(request);
			}else {
				System.out.println("没有合适的处理器处理该请求...");
			}
		}
		return response;
	}
	protected abstract Level getHandlerLevel();
	public abstract Response response(Request request); 
}

class ConcreteHandler1 extends Handler {
	protected Level getHandlerLevel() {
		return new Level(1);
	}
	public Response response(Request request) {
		System.out.println("该请求由 ConcreteHandler1 处理");
		return new Response("响应结果 1");
	}
}

class ConcreteHandler2 extends Handler {
	protected Level getHandlerLevel() {
		return new Level(2);
	}
	public Response response(Request request) {
		System.out.println("该请求由 ConcreteHandler2 处理");
		return new Response("响应结果 2");
	}
}

class ConcreteHandler3 extends Handler {
	protected Level getHandlerLevel() {
		return new Level(3);
	}
	public Response response(Request request) {
		System.out.println("该请求由 ConcreteHandler3 处理");
		return new Response("响应结果 3");
	}
}

