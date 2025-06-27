

/**
 * Respond with the correct character, given the line of the
 * poem, if this were said at the front door.
 *
 * @param {string} line
 * @returns {string}
 */
const SUMMER = [
      'Sunshine warming my toes,',
      'Underwater fun with my friends.',
      'Making homemade ice cream on the porch,',
      'Many long nights catching fireflies.',
      'Early morning walks to the creek,',
      'Reveling in the freedom of lazy days.',
    ];
var line = SUMMER[0];

for (let i = 0; i <= SUMMER.length; i++) {
  var line = SUMMER[i];
}
export function frontDoorResponse(line) {
  return line[0];
}

var word = '';
for (let i = 0; i <= SUMMER.length; i++) {
  var word = SUMMER[i][0] + SUMMER[i+1][0];
}
console.log(word);
/**
 * Format the password for the front-door, given the response
 * letters.
 *
 * @param {string} word the letters you responded with before
 * @returns {string} the front door password
 */
export function frontDoorPassword(word) {
  return toUpperCase(word);
}

/**
 * Respond with the correct character, given the line of the
 * poem, if this were said at the back door.
 *
 * @param {string} line
 * @returns {string}
 */
export function backDoorResponse(line) {
  throw new Error('Remove this line and implement the function');
}

/**
 * Format the password for the back door, given the response
 * letters.
 *
 * @param {string} word the letters you responded with before
 * @returns {string} the back door password
 */
export function backDoorPassword(word) {
  throw new Error('Remove this line and implement the function');
}