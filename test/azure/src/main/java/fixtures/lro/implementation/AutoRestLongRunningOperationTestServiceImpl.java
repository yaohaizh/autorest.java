/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro.implementation;

import com.microsoft.azure.v2.AzureEnvironment;
import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.AzureServiceClient;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.credentials.ServiceClientCredentials;
import com.microsoft.rest.v2.http.HttpPipeline;
import fixtures.lro.AutoRestLongRunningOperationTestService;
import fixtures.lro.LRORetrys;
import fixtures.lro.LROs;
import fixtures.lro.LROSADs;
import fixtures.lro.LROsCustomHeaders;

/**
 * Initializes a new instance of the AutoRestLongRunningOperationTestServiceImpl class.
 */
public class AutoRestLongRunningOperationTestServiceImpl extends AzureServiceClient implements AutoRestLongRunningOperationTestService {


    /**
     * Gets or sets the preferred language for the response.
     */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public AutoRestLongRunningOperationTestServiceImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public AutoRestLongRunningOperationTestServiceImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /**
     * When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public AutoRestLongRunningOperationTestServiceImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The LROs object to access its operations.
     */
    private LROs lROs;

    /**
     * Gets the LROs object to access its operations.
     * @return the LROs object.
     */
    public LROs lROs() {
        return this.lROs;
    }

    /**
     * The LRORetrys object to access its operations.
     */
    private LRORetrys lRORetrys;

    /**
     * Gets the LRORetrys object to access its operations.
     * @return the LRORetrys object.
     */
    public LRORetrys lRORetrys() {
        return this.lRORetrys;
    }

    /**
     * The LROSADs object to access its operations.
     */
    private LROSADs lROSADs;

    /**
     * Gets the LROSADs object to access its operations.
     * @return the LROSADs object.
     */
    public LROSADs lROSADs() {
        return this.lROSADs;
    }

    /**
     * The LROsCustomHeaders object to access its operations.
     */
    private LROsCustomHeaders lROsCustomHeaders;

    /**
     * Gets the LROsCustomHeaders object to access its operations.
     * @return the LROsCustomHeaders object.
     */
    public LROsCustomHeaders lROsCustomHeaders() {
        return this.lROsCustomHeaders;
    }

    /**
     * Initializes an instance of AutoRestLongRunningOperationTestService client.
     *
     * @param credentials the management credentials for Azure
     */
    public AutoRestLongRunningOperationTestServiceImpl(ServiceClientCredentials credentials) {
        this(AzureProxy.defaultPipeline(AutoRestLongRunningOperationTestServiceImpl.class, credentials));
    }

    /**
     * Initializes an instance of AutoRestLongRunningOperationTestService client.
     *
     * @param credentials the management credentials for Azure
     * @param azureEnvironment The environment that requests will target.
     */
    public AutoRestLongRunningOperationTestServiceImpl(ServiceClientCredentials credentials, AzureEnvironment azureEnvironment) {
        this(AzureProxy.defaultPipeline(AutoRestLongRunningOperationTestServiceImpl.class, credentials), azureEnvironment);
    }

    /**
     * Initializes an instance of AutoRestLongRunningOperationTestService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public AutoRestLongRunningOperationTestServiceImpl(HttpPipeline httpPipeline) {
        this(httpPipeline, null);
    }

    /**
     * Initializes an instance of AutoRestLongRunningOperationTestService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param azureEnvironment The environment that requests will target.
     */
    public AutoRestLongRunningOperationTestServiceImpl(HttpPipeline httpPipeline, AzureEnvironment azureEnvironment) {
        super(httpPipeline, azureEnvironment);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.lROs = new LROsImpl(this);
        this.lRORetrys = new LRORetrysImpl(this);
        this.lROSADs = new LROSADsImpl(this);
        this.lROsCustomHeaders = new LROsCustomHeadersImpl(this);
    }
}
