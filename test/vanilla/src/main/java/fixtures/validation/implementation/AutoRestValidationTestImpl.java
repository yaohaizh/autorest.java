/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.validation.implementation;

import com.microsoft.rest.v2.BodyResponse;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceClient;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.Validator;
import com.microsoft.rest.v2.VoidResponse;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PathParam;
import com.microsoft.rest.v2.annotations.POST;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpPipeline;
import fixtures.validation.AutoRestValidationTest;
import fixtures.validation.models.ErrorException;
import fixtures.validation.models.Product;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * Initializes a new instance of the AutoRestValidationTest type.
 */
public final class AutoRestValidationTestImpl extends ServiceClient implements AutoRestValidationTest {
    /**
     * The proxy service used to perform REST calls.
     */
    private AutoRestValidationTestService service;

    /**
     * Subscription ID.
     */
    private String subscriptionId;

    /**
     * Gets Subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Subscription ID.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself.
     */
    public AutoRestValidationTestImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Required string following pattern \d{2}-\d{2}-\d{4}.
     */
    private String apiVersion;

    /**
     * Gets Required string following pattern \d{2}-\d{2}-\d{4}.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /**
     * Sets Required string following pattern \d{2}-\d{2}-\d{4}.
     *
     * @param apiVersion the apiVersion value.
     * @return the service client itself.
     */
    public AutoRestValidationTestImpl withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Initializes an instance of AutoRestValidationTest client.
     */
    public AutoRestValidationTestImpl() {
        this(RestProxy.createDefaultPipeline());
    }

    /**
     * Initializes an instance of AutoRestValidationTest client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public AutoRestValidationTestImpl(@NonNull HttpPipeline httpPipeline) {
        super(httpPipeline);
        this.service = RestProxy.create(AutoRestValidationTestService.class, this);
    }

    /**
     * The interface defining all the services for AutoRestValidationTest to be
     * used by the proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    private interface AutoRestValidationTestService {
        @GET("fakepath/{subscriptionId}/{resourceGroupName}/{id}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<Product>> validationOfMethodParameters(@PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("id") int id, @QueryParam("apiVersion") String apiVersion);

        @PUT("fakepath/{subscriptionId}/{resourceGroupName}/{id}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<Product>> validationOfBody(@PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("id") int id, @BodyParam("application/json; charset=utf-8") Product body, @QueryParam("apiVersion") String apiVersion);

        @GET("validation/constantsInPath/{constantParam}/value")
        @ExpectedResponses({200})
        Single<VoidResponse> getWithConstantInPath(@PathParam("constantParam") String constantParam);

        @POST("validation/constantsInPath/{constantParam}/value")
        @ExpectedResponses({200})
        Single<BodyResponse<Product>> postWithConstantInBody(@PathParam("constantParam") String constantParam, @BodyParam("application/json; charset=utf-8") Product body);
    }

    /**
     * Validates input parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Product object if successful.
     */
    public Product validationOfMethodParameters(@NonNull String resourceGroupName, @NonNull int id) {
        return validationOfMethodParametersAsync(resourceGroupName, id).blockingGet();
    }

    /**
     * Validates input parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Product> validationOfMethodParametersAsync(@NonNull String resourceGroupName, @NonNull int id, ServiceCallback<Product> serviceCallback) {
        return ServiceFuture.fromBody(validationOfMethodParametersAsync(resourceGroupName, id), serviceCallback);
    }

    /**
     * Validates input parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Product>> validationOfMethodParametersWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull int id) {
        if (this.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.apiVersion() is required and cannot be null.");
        }
        return service.validationOfMethodParameters(this.subscriptionId(), resourceGroupName, id, this.apiVersion());
    }

    /**
     * Validates input parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Product> validationOfMethodParametersAsync(@NonNull String resourceGroupName, @NonNull int id) {
        return validationOfMethodParametersWithRestResponseAsync(resourceGroupName, id)
            .flatMapMaybe((BodyResponse<Product> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Product object if successful.
     */
    public Product validationOfBody(@NonNull String resourceGroupName, @NonNull int id) {
        return validationOfBodyAsync(resourceGroupName, id).blockingGet();
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Product> validationOfBodyAsync(@NonNull String resourceGroupName, @NonNull int id, ServiceCallback<Product> serviceCallback) {
        return ServiceFuture.fromBody(validationOfBodyAsync(resourceGroupName, id), serviceCallback);
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Product>> validationOfBodyWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull int id) {
        if (this.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.apiVersion() is required and cannot be null.");
        }
        return service.validationOfBody(this.subscriptionId(), resourceGroupName, id, bodyConverted, this.apiVersion());
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Product> validationOfBodyAsync(@NonNull String resourceGroupName, @NonNull int id) {
        return validationOfBodyWithRestResponseAsync(resourceGroupName, id)
            .flatMapMaybe((BodyResponse<Product> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body the Product value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Product object if successful.
     */
    public Product validationOfBody(@NonNull String resourceGroupName, @NonNull int id, Product body) {
        return validationOfBodyAsync(resourceGroupName, id, body).blockingGet();
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body the Product value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Product> validationOfBodyAsync(@NonNull String resourceGroupName, @NonNull int id, Product body, ServiceCallback<Product> serviceCallback) {
        return ServiceFuture.fromBody(validationOfBodyAsync(resourceGroupName, id, body), serviceCallback);
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body the Product value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Product>> validationOfBodyWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull int id, Product body) {
        if (this.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.apiVersion() is required and cannot be null.");
        }
        Validator.validate(body);
        return service.validationOfBody(this.subscriptionId(), resourceGroupName, id, bodyConverted, this.apiVersion());
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body the Product value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Product> validationOfBodyAsync(@NonNull String resourceGroupName, @NonNull int id, Product body) {
        return validationOfBodyWithRestResponseAsync(resourceGroupName, id, body)
            .flatMapMaybe((BodyResponse<Product> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void getWithConstantInPath() {
        getWithConstantInPathAsync().blockingAwait();
    }

    /**
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> getWithConstantInPathAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getWithConstantInPathAsync(), serviceCallback);
    }

    /**
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> getWithConstantInPathWithRestResponseAsync() {
        return service.getWithConstantInPath(constantParam);
    }

    /**
     * @return a Single which performs the network request upon subscription.
     */
    public Completable getWithConstantInPathAsync() {
        return getWithConstantInPathWithRestResponseAsync()
            .flatMapMaybe((VoidResponse res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Product object if successful.
     */
    public Product postWithConstantInBody() {
        return postWithConstantInBodyAsync().blockingGet();
    }

    /**
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Product> postWithConstantInBodyAsync(ServiceCallback<Product> serviceCallback) {
        return ServiceFuture.fromBody(postWithConstantInBodyAsync(), serviceCallback);
    }

    /**
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Product>> postWithConstantInBodyWithRestResponseAsync() {
        return service.postWithConstantInBody(constantParam, bodyConverted);
    }

    /**
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Product> postWithConstantInBodyAsync() {
        return postWithConstantInBodyWithRestResponseAsync()
            .flatMapMaybe((BodyResponse<Product> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * @param body the Product value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Product object if successful.
     */
    public Product postWithConstantInBody(Product body) {
        return postWithConstantInBodyAsync(body).blockingGet();
    }

    /**
     * @param body the Product value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Product> postWithConstantInBodyAsync(Product body, ServiceCallback<Product> serviceCallback) {
        return ServiceFuture.fromBody(postWithConstantInBodyAsync(body), serviceCallback);
    }

    /**
     * @param body the Product value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Product>> postWithConstantInBodyWithRestResponseAsync(Product body) {
        Validator.validate(body);
        return service.postWithConstantInBody(constantParam, bodyConverted);
    }

    /**
     * @param body the Product value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Product> postWithConstantInBodyAsync(Product body) {
        return postWithConstantInBodyWithRestResponseAsync(body)
            .flatMapMaybe((BodyResponse<Product> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }
}
