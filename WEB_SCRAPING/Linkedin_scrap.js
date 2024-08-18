const axios = require('axios');
const cheerio = require('cheerio');

// Function to perform web scraping
async function scrapeJobListings() {
  try {
    // URL of the job search website
    const url = 'https://www.linkedin.com/jobs/search/?currentJobId=3800533603&keywords=software%20engineer%20java&origin=SWITCH_SEARCH_VERTICAL';
    console.log("here");
    // Make an HTTP GET request to the website
    const response = await axios.get(url);

    // Load the HTML content into Cheerio for parsing
    const $ = cheerio.load(response.data);

    // Find and iterate through job listings
    $('.job-listing').each((index, element) => {
      const title = $(element).find('.job-title').text().trim();
      const experience = $(element).find('.experience').text().trim();
      console.log("here");
      // Check if the job is for a Java developer with 1 to 3 years of experience
      if (title.toLowerCase().includes('java') && experience.match(/\b\d\b/) >= 1 && experience.match(/\b\d\b/) <= 3) {
        console.log(`Job Title: ${title}`);
        console.log(`Experience: ${experience}`);
        console.log('---------------------');
      }
    });

  } catch (error) {
    console.error('Error:', error.message);
  }
}

// Call the scraping function
scrapeJobListings();
