/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodystring.implementation;

import com.microsoft.rest.v2.Base64Url;
import com.microsoft.rest.v2.BodyResponse;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.VoidResponse;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.ReturnValueWireType;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import fixtures.bodystring.Strings;
import fixtures.bodystring.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * Strings.
 */
public final class StringsImpl implements Strings {
    /**
     * The proxy service used to perform REST calls.
     */
    private StringsService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestSwaggerBATServiceImpl client;

    /**
     * Initializes an instance of StringsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public StringsImpl(AutoRestSwaggerBATServiceImpl client) {
        this.service = RestProxy.create(StringsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Strings to be used by the
     * proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    private interface StringsService {
        @GET("string/null")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<String>> getNull();

        @PUT("string/null")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<VoidResponse> putNull(@BodyParam("application/json; charset=utf-8") String stringBody);

        @GET("string/empty")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<String>> getEmpty();

        @PUT("string/empty")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<VoidResponse> putEmpty(@BodyParam("application/json; charset=utf-8") String stringBody);

        @GET("string/mbcs")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<String>> getMbcs();

        @PUT("string/mbcs")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<VoidResponse> putMbcs(@BodyParam("application/json; charset=utf-8") String stringBody);

        @GET("string/whitespace")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<String>> getWhitespace();

        @PUT("string/whitespace")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<VoidResponse> putWhitespace(@BodyParam("application/json; charset=utf-8") String stringBody);

        @GET("string/notProvided")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<String>> getNotProvided();

        @GET("string/base64Encoding")
        @ExpectedResponses({200})
        @ReturnValueWireType(Base64Url.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<byte[]>> getBase64Encoded();

        @GET("string/base64UrlEncoding")
        @ExpectedResponses({200})
        @ReturnValueWireType(Base64Url.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<byte[]>> getBase64UrlEncoded();

        @PUT("string/base64UrlEncoding")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<VoidResponse> putBase64UrlEncoded(@BodyParam("application/json; charset=utf-8") Base64Url stringBody);

        @GET("string/nullBase64UrlEncoding")
        @ExpectedResponses({200})
        @ReturnValueWireType(Base64Url.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<byte[]>> getNullBase64UrlEncoded();
    }

    /**
     * Get null string value value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    public String getNull() {
        return getNullAsync().blockingGet();
    }

    /**
     * Get null string value value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<String> getNullAsync(ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromBody(getNullAsync(), serviceCallback);
    }

    /**
     * Get null string value value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<String>> getNullWithRestResponseAsync() {
        return service.getNull();
    }

    /**
     * Get null string value value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<String> getNullAsync() {
        return getNullWithRestResponseAsync()
            .flatMapMaybe((BodyResponse<String> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Set string value null.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putNull() {
        putNullAsync().blockingAwait();
    }

    /**
     * Set string value null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> putNullAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putNullAsync(), serviceCallback);
    }

    /**
     * Set string value null.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> putNullWithRestResponseAsync() {
        return service.putNull(stringBody);
    }

    /**
     * Set string value null.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Completable putNullAsync() {
        return putNullWithRestResponseAsync()
            .flatMapMaybe((VoidResponse res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putNull(String stringBody) {
        putNullAsync(stringBody).blockingAwait();
    }

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> putNullAsync(String stringBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putNullAsync(stringBody), serviceCallback);
    }

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> putNullWithRestResponseAsync(String stringBody) {
        return service.putNull(stringBody);
    }

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable putNullAsync(String stringBody) {
        return putNullWithRestResponseAsync(stringBody)
            .flatMapMaybe((VoidResponse res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Get empty string value value ''.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    public String getEmpty() {
        return getEmptyAsync().blockingGet();
    }

    /**
     * Get empty string value value ''.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<String> getEmptyAsync(ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromBody(getEmptyAsync(), serviceCallback);
    }

    /**
     * Get empty string value value ''.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<String>> getEmptyWithRestResponseAsync() {
        return service.getEmpty();
    }

    /**
     * Get empty string value value ''.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<String> getEmptyAsync() {
        return getEmptyWithRestResponseAsync()
            .flatMapMaybe((BodyResponse<String> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Set string value empty ''.
     *
     * @param stringBody Possible values include: ''.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putEmpty(@NonNull String stringBody) {
        putEmptyAsync(stringBody).blockingAwait();
    }

    /**
     * Set string value empty ''.
     *
     * @param stringBody Possible values include: ''.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> putEmptyAsync(@NonNull String stringBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putEmptyAsync(stringBody), serviceCallback);
    }

    /**
     * Set string value empty ''.
     *
     * @param stringBody Possible values include: ''.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> putEmptyWithRestResponseAsync(@NonNull String stringBody) {
        if (stringBody == null) {
            throw new IllegalArgumentException("Parameter stringBody is required and cannot be null.");
        }
        return service.putEmpty(stringBody);
    }

    /**
     * Set string value empty ''.
     *
     * @param stringBody Possible values include: ''.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable putEmptyAsync(@NonNull String stringBody) {
        return putEmptyWithRestResponseAsync(stringBody)
            .flatMapMaybe((VoidResponse res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    public String getMbcs() {
        return getMbcsAsync().blockingGet();
    }

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<String> getMbcsAsync(ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromBody(getMbcsAsync(), serviceCallback);
    }

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<String>> getMbcsWithRestResponseAsync() {
        return service.getMbcs();
    }

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<String> getMbcsAsync() {
        return getMbcsWithRestResponseAsync()
            .flatMapMaybe((BodyResponse<String> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @param stringBody Possible values include: '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putMbcs(@NonNull String stringBody) {
        putMbcsAsync(stringBody).blockingAwait();
    }

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @param stringBody Possible values include: '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> putMbcsAsync(@NonNull String stringBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putMbcsAsync(stringBody), serviceCallback);
    }

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @param stringBody Possible values include: '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> putMbcsWithRestResponseAsync(@NonNull String stringBody) {
        if (stringBody == null) {
            throw new IllegalArgumentException("Parameter stringBody is required and cannot be null.");
        }
        return service.putMbcs(stringBody);
    }

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @param stringBody Possible values include: '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable putMbcsAsync(@NonNull String stringBody) {
        return putMbcsWithRestResponseAsync(stringBody)
            .flatMapMaybe((VoidResponse res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    public String getWhitespace() {
        return getWhitespaceAsync().blockingGet();
    }

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<String> getWhitespaceAsync(ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromBody(getWhitespaceAsync(), serviceCallback);
    }

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<String>> getWhitespaceWithRestResponseAsync() {
        return service.getWhitespace();
    }

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<String> getWhitespaceAsync() {
        return getWhitespaceWithRestResponseAsync()
            .flatMapMaybe((BodyResponse<String> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody Possible values include: '    Now is the time for all good men to come to the aid of their country    '.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putWhitespace(@NonNull String stringBody) {
        putWhitespaceAsync(stringBody).blockingAwait();
    }

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody Possible values include: '    Now is the time for all good men to come to the aid of their country    '.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> putWhitespaceAsync(@NonNull String stringBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putWhitespaceAsync(stringBody), serviceCallback);
    }

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody Possible values include: '    Now is the time for all good men to come to the aid of their country    '.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> putWhitespaceWithRestResponseAsync(@NonNull String stringBody) {
        if (stringBody == null) {
            throw new IllegalArgumentException("Parameter stringBody is required and cannot be null.");
        }
        return service.putWhitespace(stringBody);
    }

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody Possible values include: '    Now is the time for all good men to come to the aid of their country    '.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable putWhitespaceAsync(@NonNull String stringBody) {
        return putWhitespaceWithRestResponseAsync(stringBody)
            .flatMapMaybe((VoidResponse res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    public String getNotProvided() {
        return getNotProvidedAsync().blockingGet();
    }

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<String> getNotProvidedAsync(ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromBody(getNotProvidedAsync(), serviceCallback);
    }

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<String>> getNotProvidedWithRestResponseAsync() {
        return service.getNotProvided();
    }

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<String> getNotProvidedAsync() {
        return getNotProvidedWithRestResponseAsync()
            .flatMapMaybe((BodyResponse<String> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Get value that is base64 encoded.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    public byte[] getBase64Encoded() {
        return getBase64EncodedAsync().blockingGet();
    }

    /**
     * Get value that is base64 encoded.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<byte[]> getBase64EncodedAsync(ServiceCallback<byte[]> serviceCallback) {
        return ServiceFuture.fromBody(getBase64EncodedAsync(), serviceCallback);
    }

    /**
     * Get value that is base64 encoded.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<byte[]>> getBase64EncodedWithRestResponseAsync() {
        return service.getBase64Encoded();
    }

    /**
     * Get value that is base64 encoded.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<byte[]> getBase64EncodedAsync() {
        return getBase64EncodedWithRestResponseAsync()
            .flatMapMaybe((BodyResponse<byte[]> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Get value that is base64url encoded.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    public byte[] getBase64UrlEncoded() {
        return getBase64UrlEncodedAsync().blockingGet();
    }

    /**
     * Get value that is base64url encoded.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<byte[]> getBase64UrlEncodedAsync(ServiceCallback<byte[]> serviceCallback) {
        return ServiceFuture.fromBody(getBase64UrlEncodedAsync(), serviceCallback);
    }

    /**
     * Get value that is base64url encoded.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<byte[]>> getBase64UrlEncodedWithRestResponseAsync() {
        return service.getBase64UrlEncoded();
    }

    /**
     * Get value that is base64url encoded.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<byte[]> getBase64UrlEncodedAsync() {
        return getBase64UrlEncodedWithRestResponseAsync()
            .flatMapMaybe((BodyResponse<byte[]> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the byte[] value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putBase64UrlEncoded(@NonNull byte[] stringBody) {
        putBase64UrlEncodedAsync(stringBody).blockingAwait();
    }

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the byte[] value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> putBase64UrlEncodedAsync(@NonNull byte[] stringBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putBase64UrlEncodedAsync(stringBody), serviceCallback);
    }

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the byte[] value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> putBase64UrlEncodedWithRestResponseAsync(@NonNull byte[] stringBody) {
        if (stringBody == null) {
            throw new IllegalArgumentException("Parameter stringBody is required and cannot be null.");
        }
        Base64Url stringBodyConverted = Base64Url.encode(stringBody);
        return service.putBase64UrlEncoded(stringBodyConverted);
    }

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the byte[] value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable putBase64UrlEncodedAsync(@NonNull byte[] stringBody) {
        return putBase64UrlEncodedWithRestResponseAsync(stringBody)
            .flatMapMaybe((VoidResponse res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    public byte[] getNullBase64UrlEncoded() {
        return getNullBase64UrlEncodedAsync().blockingGet();
    }

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<byte[]> getNullBase64UrlEncodedAsync(ServiceCallback<byte[]> serviceCallback) {
        return ServiceFuture.fromBody(getNullBase64UrlEncodedAsync(), serviceCallback);
    }

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<byte[]>> getNullBase64UrlEncodedWithRestResponseAsync() {
        return service.getNullBase64UrlEncoded();
    }

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<byte[]> getNullBase64UrlEncodedAsync() {
        return getNullBase64UrlEncodedWithRestResponseAsync()
            .flatMapMaybe((BodyResponse<byte[]> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }
}
