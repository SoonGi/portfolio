<template>
    <!-- App.vue -->
    <div>
        <template v-if="!loggedIn">
            <login v-on:login="postLogin"></login>
        </template>
        <template v-else>
            <v-app>
                <v-navigation-drawer app>
                    <!-- -->
                </v-navigation-drawer>

                <v-app-bar app>
                    <!-- -->
                </v-app-bar>

                <!-- Sizes your content based upon application components -->
                <v-content>
                    <!-- Provides the application the proper gutter -->
                    <v-container fluid>
                        <!-- If using vue-router -->
                        <router-view></router-view>
                    </v-container>
                </v-content>

                <v-footer app>
                    <!-- -->
                </v-footer>
            </v-app>
        </template>
    </div>
</template>

<style lang="scss">
#app {
    font-family: "Avenir", Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
}

#nav {
    padding: 30px;

    a {
        font-weight: bold;
        color: #2c3e50;

        &.router-link-exact-active {
            color: #42b983;
        }
    }
}
</style>
<script>

import Login from './views/Login.vue';
export default {
    data: function() {
        return {
            loggedIn: false
        }
    },
    components: {
        'login': Login
    },
    methods: {
        postLogin: function() {
            this.loggedIn = true;
        }
    }
};
</script>
