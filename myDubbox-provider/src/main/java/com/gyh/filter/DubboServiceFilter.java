package com.gyh.filter;

import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcException;
import com.gyh.utils.JacksonUtils;

public class DubboServiceFilter implements Filter {

	public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {

		Object[] objects = invocation.getArguments();
		if ((objects != null) && (objects.length > 0)) {
			System.out.println(JacksonUtils.toJson(objects));

			Result result = invoker.invoke(invocation);
			System.out.println(JacksonUtils.toJson(result));
			invoker.getUrl();

			return result;
		}
		Result result = invoker.invoke(invocation);
		System.out.println(JacksonUtils.toJson(result));
		return result;
	}
}