const path = require('path');

module.exports = {
  entry: './src/index.js',
  output: {
    filename: 'bundle.js',
    path: path.resolve(__dirname, 'dist'),
  },
  module: {
    rules: [
      {
        test: /\.[jt]sx?$/,
        use: ['babel-loader', 'style-loader', 'css-loader'],
        include: path.resolve(__dirname, 'src'),
        exclude: /node_modules/,
      }
    ]
  }
};