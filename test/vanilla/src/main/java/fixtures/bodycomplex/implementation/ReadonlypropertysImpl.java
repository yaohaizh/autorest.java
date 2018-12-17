/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.implementation;

import com.microsoft.rest.v2.BodyResponse;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.Validator;
import com.microsoft.rest.v2.VoidResponse;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import fixtures.bodycomplex.Readonlypropertys;
import fixtures.bodycomplex.models.ErrorException;
import fixtures.bodycomplex.models.ReadonlyObj;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * Readonlypropertys.
 */
public final class ReadonlypropertysImpl implements Readonlypropertys {
    /**
     * The proxy service used to perform REST calls.
     */
    private ReadonlypropertysService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestComplexTestServiceImpl client;

    /**
     * Initializes an instance of ReadonlypropertysImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ReadonlypropertysImpl(AutoRestComplexTestServiceImpl client) {
        this.service = RestProxy.create(ReadonlypropertysService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Readonlypropertys to be used
     * by the proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    private interface ReadonlypropertysService {
        @GET("complex/readonlyproperty/valid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<ReadonlyObj>> getValid();

        @PUT("complex/readonlyproperty/valid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<VoidResponse> putValid(@BodyParam("application/json; charset=utf-8") ReadonlyObj complexBody);
    }

    /**
     * Get complex types that have readonly properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ReadonlyObj object if successful.
     */
    public ReadonlyObj getValid() {
        return getValidAsync().blockingGet();
    }

    /**
     * Get complex types that have readonly properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<ReadonlyObj> getValidAsync(ServiceCallback<ReadonlyObj> serviceCallback) {
        return ServiceFuture.fromBody(getValidAsync(), serviceCallback);
    }

    /**
     * Get complex types that have readonly properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<ReadonlyObj>> getValidWithRestResponseAsync() {
        return service.getValid();
    }

    /**
     * Get complex types that have readonly properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<ReadonlyObj> getValidAsync() {
        return getValidWithRestResponseAsync()
            .flatMapMaybe((BodyResponse<ReadonlyObj> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Put complex types that have readonly properties.
     *
     * @param complexBody the ReadonlyObj value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putValid(@NonNull ReadonlyObj complexBody) {
        putValidAsync(complexBody).blockingAwait();
    }

    /**
     * Put complex types that have readonly properties.
     *
     * @param complexBody the ReadonlyObj value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> putValidAsync(@NonNull ReadonlyObj complexBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putValidAsync(complexBody), serviceCallback);
    }

    /**
     * Put complex types that have readonly properties.
     *
     * @param complexBody the ReadonlyObj value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> putValidWithRestResponseAsync(@NonNull ReadonlyObj complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putValid(complexBodyConverted);
    }

    /**
     * Put complex types that have readonly properties.
     *
     * @param complexBody the ReadonlyObj value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable putValidAsync(@NonNull ReadonlyObj complexBody) {
        return putValidWithRestResponseAsync(complexBody)
            .flatMapMaybe((VoidResponse res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }
}
