PACKAGES = "${PN} gir1.2-soup-2.4 libsoup-gnome2.4-1 libsoup2.4-1 libsoup2.4-dev"
PROVIDES = "gir1.2-soup-2.4 libsoup-gnome2.4-1 libsoup2.4-1 libsoup2.4-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libs/libsoup2.4/gir1.2-soup-2.4_2.64.2-2_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/libs/libsoup2.4/libsoup-gnome2.4-1_2.64.2-2_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/libs/libsoup2.4/libsoup2.4-1_2.64.2-2_armhf.deb;unpack=0;name=deb2\
	http://ftp.de.debian.org/debian/pool/main/libs/libsoup2.4/libsoup2.4-dev_2.64.2-2_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_gir1.2-soup-2.4 = "gir1.2-soup-2.4_2.64.2-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "c63d496ad4e58610451448c6d2393528b24b7cb1b30d6241904c69e3cb2294d5"
SRC_URI[deb0.md5sum] = "e8969c5921a743dab115c59f54b65966"
DEBFILENAME_libsoup-gnome2.4-1 = "libsoup-gnome2.4-1_2.64.2-2_armhf.deb"
SRC_URI[deb1.sha256sum] = "6c7d0eea4ebe778200803db9c75f524db49d0a68878a2d96f2c4b455897d98ca"
SRC_URI[deb1.md5sum] = "343f9b83c81cde68753f66cae6f6a020"
DEBFILENAME_libsoup2.4-1 = "libsoup2.4-1_2.64.2-2_armhf.deb"
SRC_URI[deb2.sha256sum] = "c44be76bf2779aa65c442d02f531a95d4430de34067b2db455c7557a8d42dcaf"
SRC_URI[deb2.md5sum] = "acfb52ca94c20a4df1f2b8e96cef66c6"
DEBFILENAME_libsoup2.4-dev = "libsoup2.4-dev_2.64.2-2_armhf.deb"
SRC_URI[deb3.sha256sum] = "0450d72d65d70a2b05987647cb05ca70e29820b69d0b2270521f0d82a45de965"
SRC_URI[deb3.md5sum] = "994d06d1d5699756fabe75e8bbadf015"

RDEPENDS_gir1.2-soup-2.4 = "gir1.2-glib-2.0 (>= 0.9.5) libsoup-gnome2.4-1 (>= 2.27.4) libsoup2.4-1 (>= 2.61.90)"
RDEPENDS_libsoup-gnome2.4-1 = "libc6 (>= 2.4) libglib2.0-0 (>= 2.39.90) libsoup2.4-1 (>= 2.41.90)"
RDEPENDS_${PN}-1 = "glib-networking (>= 2.32.0) libc6 (>= 2.4) libglib2.0-0 (>= 2.39.90) libgssapi-krb5-2 (>= 1.14+dfsg) libpsl5 (>= 0.16.0) libsqlite3-0 (>= 3.5.9) libxml2 (>= 2.7.4)"
RDEPENDS_${PN}-dev = "gir1.2-soup-2.4 (= 2.64.2-2) libglib2.0-dev (>= 2.35.0) libsoup2.4-1 (= 2.64.2-2) libxml2-dev"
DEPENDS = "gir1.2-glib-2.0 glib-networking libc6 libglib2.0-0 libglib2.0-dev libgssapi-krb5-2 libpsl5 libsqlite3-0 libxml2 libxml2-dev"


inherit deb_group

FILES_gir1.2-soup-2.4 = " \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/Soup-2.4.typelib \
    ./usr/lib/arm-linux-gnueabihf/girepository-1.0/SoupGNOME-2.4.typelib \
    ./usr/share/doc/gir1.2-soup-2.4/changelog.Debian.gz \
    ./usr/share/doc/gir1.2-soup-2.4/copyright\
"
FILES_libsoup-gnome2.4-1 = " \
    ./usr/lib/arm-linux-gnueabihf/libsoup-gnome-2.4.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libsoup-gnome-2.4.so.1.8.0 \
    ./usr/share/doc/libsoup-gnome2.4-1/changelog.Debian.gz \
    ./usr/share/doc/libsoup-gnome2.4-1/copyright\
"
FILES_libsoup2.4-1 = " \
    ./usr/lib/arm-linux-gnueabihf/libsoup-2.4.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libsoup-2.4.so.1.8.0 \
    ./usr/share/doc/libsoup2.4-1/AUTHORS \
    ./usr/share/doc/libsoup2.4-1/NEWS.gz \
    ./usr/share/doc/libsoup2.4-1/README \
    ./usr/share/doc/libsoup2.4-1/changelog.Debian.gz \
    ./usr/share/doc/libsoup2.4-1/copyright\
"
FILES_${PN}-dev = " \
    ./usr/include/libsoup-2.4/libsoup/soup-address.h \
    ./usr/include/libsoup-2.4/libsoup/soup-auth-domain-basic.h \
    ./usr/include/libsoup-2.4/libsoup/soup-auth-domain-digest.h \
    ./usr/include/libsoup-2.4/libsoup/soup-auth-domain.h \
    ./usr/include/libsoup-2.4/libsoup/soup-auth-manager.h \
    ./usr/include/libsoup-2.4/libsoup/soup-auth.h \
    ./usr/include/libsoup-2.4/libsoup/soup-autocleanups.h \
    ./usr/include/libsoup-2.4/libsoup/soup-cache.h \
    ./usr/include/libsoup-2.4/libsoup/soup-content-decoder.h \
    ./usr/include/libsoup-2.4/libsoup/soup-content-sniffer.h \
    ./usr/include/libsoup-2.4/libsoup/soup-cookie-jar-db.h \
    ./usr/include/libsoup-2.4/libsoup/soup-cookie-jar-text.h \
    ./usr/include/libsoup-2.4/libsoup/soup-cookie-jar.h \
    ./usr/include/libsoup-2.4/libsoup/soup-cookie.h \
    ./usr/include/libsoup-2.4/libsoup/soup-date.h \
    ./usr/include/libsoup-2.4/libsoup/soup-enum-types.h \
    ./usr/include/libsoup-2.4/libsoup/soup-form.h \
    ./usr/include/libsoup-2.4/libsoup/soup-headers.h \
    ./usr/include/libsoup-2.4/libsoup/soup-logger.h \
    ./usr/include/libsoup-2.4/libsoup/soup-message-body.h \
    ./usr/include/libsoup-2.4/libsoup/soup-message-headers.h \
    ./usr/include/libsoup-2.4/libsoup/soup-message.h \
    ./usr/include/libsoup-2.4/libsoup/soup-method.h \
    ./usr/include/libsoup-2.4/libsoup/soup-misc.h \
    ./usr/include/libsoup-2.4/libsoup/soup-multipart-input-stream.h \
    ./usr/include/libsoup-2.4/libsoup/soup-multipart.h \
    ./usr/include/libsoup-2.4/libsoup/soup-password-manager.h \
    ./usr/include/libsoup-2.4/libsoup/soup-portability.h \
    ./usr/include/libsoup-2.4/libsoup/soup-proxy-resolver-default.h \
    ./usr/include/libsoup-2.4/libsoup/soup-proxy-resolver.h \
    ./usr/include/libsoup-2.4/libsoup/soup-proxy-uri-resolver.h \
    ./usr/include/libsoup-2.4/libsoup/soup-request-data.h \
    ./usr/include/libsoup-2.4/libsoup/soup-request-file.h \
    ./usr/include/libsoup-2.4/libsoup/soup-request-http.h \
    ./usr/include/libsoup-2.4/libsoup/soup-request.h \
    ./usr/include/libsoup-2.4/libsoup/soup-requester.h \
    ./usr/include/libsoup-2.4/libsoup/soup-server.h \
    ./usr/include/libsoup-2.4/libsoup/soup-session-async.h \
    ./usr/include/libsoup-2.4/libsoup/soup-session-feature.h \
    ./usr/include/libsoup-2.4/libsoup/soup-session-sync.h \
    ./usr/include/libsoup-2.4/libsoup/soup-session.h \
    ./usr/include/libsoup-2.4/libsoup/soup-socket.h \
    ./usr/include/libsoup-2.4/libsoup/soup-status.h \
    ./usr/include/libsoup-2.4/libsoup/soup-tld.h \
    ./usr/include/libsoup-2.4/libsoup/soup-types.h \
    ./usr/include/libsoup-2.4/libsoup/soup-uri.h \
    ./usr/include/libsoup-2.4/libsoup/soup-value-utils.h \
    ./usr/include/libsoup-2.4/libsoup/soup-version.h \
    ./usr/include/libsoup-2.4/libsoup/soup-websocket-connection.h \
    ./usr/include/libsoup-2.4/libsoup/soup-websocket.h \
    ./usr/include/libsoup-2.4/libsoup/soup-xmlrpc-old.h \
    ./usr/include/libsoup-2.4/libsoup/soup-xmlrpc.h \
    ./usr/include/libsoup-2.4/libsoup/soup.h \
    ./usr/lib/arm-linux-gnueabihf/libsoup-2.4.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libsoup-2.4.pc \
    ./usr/share/doc/libsoup2.4-dev/changelog.Debian.gz \
    ./usr/share/doc/libsoup2.4-dev/copyright \
    ./usr/share/gir-1.0/Soup-2.4.gir \
    ./usr/share/vala/vapi/libsoup-2.4.deps \
    ./usr/share/vala/vapi/libsoup-2.4.vapi\
"
