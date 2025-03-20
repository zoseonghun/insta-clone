/* src/main/resources/static/js/index.js */

import initStories from './components/stories.js';
import initCreateFeedModal from './components/create-feed-modal.js';
import initMoreMenu from './components/more-menu.js';

document.addEventListener('DOMContentLoaded', () => {
  initStories();
  initCreateFeedModal();
  initMoreMenu(); // 더보기 버튼 클릭 관련
});