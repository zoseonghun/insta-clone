/* src/main/resources/static/js/index.js */

import initStories from './components/stories.js';
import initCreateFeedModal from './components/create-feed-modal.js';
document.addEventListener('DOMContentLoaded', () => {
  initStories();
  initCreateFeedModal();
});