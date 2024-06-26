
	public void i_use_the_weather_service_to_get_the_information() {
		Set<Map.Entry<String, String>> set = zipAndCities.entrySet()
		Iterator<Map.Entry<String, String>> iterator = set.iterator()
	
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next()
			String zipCode = entry.getKey() // Use getKey() to get the key
			String city = entry.getValue()
	
			String[] prop = {"usePropertyFileFlag=true", "zipCode=" + zipCode, "city=" + city}
	
			try {
				SoapUITestCaseRunner soapUITestCaseRunner = new SoapUITestCaseRunner()
				soapUITestCaseRunner.setProjectFile("src/test/resources/WeatherSoapTest-soapui-project.xml")
				soapUITestCaseRunner.setProjectProperties(prop)
				soapUITestCaseRunner.setTestSuite("TestSuite1")
				soapUITestCaseRunner.setTestCase("TestCase1")
				soapUITestCaseRunner.run()
			} catch (Exception e) {
				System.err.println("Checking " + zipCode + " failed!")
				failureCount++
				zipCodes.append(zipCode + " [" + city + "] ")
				e.printStackTrace()
			} finally {
				totalCount++
			}
		}
	}