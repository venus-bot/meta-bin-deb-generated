PACKAGES = "gir1.2-soup-2.4 libsoup-gnome2.4-1 libsoup2.4-1 libsoup2.4-dev"
PROVIDES = "gir1.2-soup-2.4 libsoup-gnome2.4-1 libsoup2.4-1 libsoup2.4-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libs/libsoup2.4/gir1.2-soup-2.4_2.48.0-1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/libs/libsoup2.4/libsoup-gnome2.4-1_2.48.0-1_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/libs/libsoup2.4/libsoup2.4-1_2.48.0-1_armhf.deb;unpack=0;name=deb2\
	http://ftp.de.debian.org/debian/pool/main/libs/libsoup2.4/libsoup2.4-dev_2.48.0-1_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_gir1.2-soup-2.4 = "gir1.2-soup-2.4_2.48.0-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "4e117bd99b2cceb6768e90af1f27904c92d7ac6aeeb27af14d2fc78c890bba21"
SRC_URI[deb0.md5sum] = "d85a0cdc295fe9e555a031e87358b4dd"
DEBFILENAME_libsoup-gnome2.4-1 = "libsoup-gnome2.4-1_2.48.0-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "b797b9963afb878ce57f53b07d67de0cd3de6ffd46152d9551e00ecebc0fecad"
SRC_URI[deb1.md5sum] = "079f88e27572ba12f39e14889f297f14"
DEBFILENAME_libsoup2.4-1 = "libsoup2.4-1_2.48.0-1_armhf.deb"
SRC_URI[deb2.sha256sum] = "358d0a1447a3a7032504a4a4cb9bb3286fa88f3715a36a0bbad26a6363bbe098"
SRC_URI[deb2.md5sum] = "8f7b9394d5415280b066176a6d8691d1"
DEBFILENAME_libsoup2.4-dev = "libsoup2.4-dev_2.48.0-1_armhf.deb"
SRC_URI[deb3.sha256sum] = "9c1f762fcf3b5e82f35247d155804120dbc096ef24f3e488b2ce1d226a697ff5"
SRC_URI[deb3.md5sum] = "5fa37e99fc7826066c0ed53191f572cb"

RDEPENDS_gir1.2-soup-2.4 = "gir1.2-glib-2.0 libsoup-gnome2.4-1 (>= 2.27.4) libsoup2.4-1 (>= 2.47.4)"
RDEPENDS_libsoup-gnome2.4-1 = "libc6 (>= 2.4) libglib2.0-0 (>= 2.39.90) libsoup2.4-1 (>= 2.41.90) libsqlite3-0 (>= 3.5.9) libxml2 (>= 2.6.27)"
RDEPENDS_${PN}-1 = "libc6 (>= 2.4) libglib2.0-0 (>= 2.39.90) libsqlite3-0 (>= 3.5.9) libxml2 (>= 2.7.4) glib-networking (>= 2.32.0)"
RDEPENDS_${PN}-dev = "libsoup2.4-1 (= 2.48.0-1) gir1.2-soup-2.4 (= 2.48.0-1) libglib2.0-dev (>= 2.35.0) libxml2-dev"
DEPENDS = "libglib2.0-0 glib-networking libxml2 gir1.2-glib-2.0 libsqlite3-0 libc6 libxml2-dev libglib2.0-dev"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_gir1.2-soup-2.4 = " \
	./usr/lib/girepository-1.0/Soup-2.4.typelib \
	./usr/share/doc/gir1.2-soup-2.4/AUTHORS \
	./usr/share/doc/gir1.2-soup-2.4/copyright \
	./usr/lib/girepository-1.0/SoupGNOME-2.4.typelib \
	./usr/share/doc/gir1.2-soup-2.4/README \
	./usr/share/doc/gir1.2-soup-2.4/NEWS.gz \
	./usr/share/doc/gir1.2-soup-2.4/changelog.Debian.gz\
"
FILES_libsoup-gnome2.4-1 = " \
	./usr/share/doc/libsoup-gnome2.4-1/changelog.Debian.gz \
	./usr/share/doc/libsoup-gnome2.4-1/AUTHORS \
	./usr/share/doc/libsoup-gnome2.4-1/NEWS.gz \
	./usr/lib/arm-linux-gnueabihf/libsoup-gnome-2.4.so.1.7.0 \
	./usr/lib/arm-linux-gnueabihf/libsoup-gnome-2.4.so.1 \
	./usr/share/doc/libsoup-gnome2.4-1/README \
	./usr/share/doc/libsoup-gnome2.4-1/copyright\
"
FILES_libsoup2.4-1 = " \
	./usr/share/doc/libsoup2.4-1/NEWS.gz \
	./usr/share/doc/libsoup2.4-1/changelog.Debian.gz \
	./usr/share/doc/libsoup2.4-1/README \
	./usr/lib/arm-linux-gnueabihf/libsoup-2.4.so.1 \
	./usr/share/doc/libsoup2.4-1/AUTHORS \
	./usr/lib/arm-linux-gnueabihf/libsoup-2.4.so.1.7.0 \
	./usr/share/doc/libsoup2.4-1/copyright\
"
FILES_${PN}-dev = " \
	./usr/include/libsoup-2.4/libsoup/soup-form.h \
	./usr/include/libsoup-2.4/libsoup/soup-socket.h \
	./usr/include/libsoup-2.4/libsoup/soup-request-http.h \
	./usr/share/doc/libsoup2.4-dev/changelog.Debian.gz \
	./usr/include/libsoup-2.4/libsoup/soup-cookie-jar-db.h \
	./usr/share/doc/libsoup2.4-dev/NEWS.gz \
	./usr/include/libsoup-2.4/libsoup/soup-portability.h \
	./usr/include/libsoup-2.4/libsoup/soup.h \
	./usr/include/libsoup-2.4/libsoup/soup-date.h \
	./usr/include/libsoup-2.4/libsoup/soup-multipart.h \
	./usr/share/gir-1.0/Soup-2.4.gir \
	./usr/include/libsoup-2.4/libsoup/soup-request.h \
	./usr/include/libsoup-2.4/libsoup/soup-xmlrpc.h \
	./usr/lib/arm-linux-gnueabihf/libsoup-2.4.so \
	./usr/share/doc/libsoup2.4-dev/copyright \
	./usr/lib/arm-linux-gnueabihf/libsoup-2.4.a \
	./usr/include/libsoup-2.4/libsoup/soup-session-feature.h \
	./usr/include/libsoup-2.4/libsoup/soup-headers.h \
	./usr/include/libsoup-2.4/libsoup/soup-request-file.h \
	./usr/include/libsoup-2.4/libsoup/soup-proxy-resolver-default.h \
	./usr/include/libsoup-2.4/libsoup/soup-auth-domain.h \
	./usr/include/libsoup-2.4/libsoup/soup-session-sync.h \
	./usr/include/libsoup-2.4/libsoup/soup-multipart-input-stream.h \
	./usr/include/libsoup-2.4/libsoup/soup-auth.h \
	./usr/include/libsoup-2.4/libsoup/soup-value-utils.h \
	./usr/include/libsoup-2.4/libsoup/soup-password-manager.h \
	./usr/include/libsoup-2.4/libsoup/soup-message.h \
	./usr/include/libsoup-2.4/libsoup/soup-message-headers.h \
	./usr/include/libsoup-2.4/libsoup/soup-method.h \
	./usr/include/libsoup-2.4/libsoup/soup-session.h \
	./usr/include/libsoup-2.4/libsoup/soup-auth-manager.h \
	./usr/include/libsoup-2.4/libsoup/soup-cache.h \
	./usr/include/libsoup-2.4/libsoup/soup-content-sniffer.h \
	./usr/include/libsoup-2.4/libsoup/soup-cookie-jar.h \
	./usr/include/libsoup-2.4/libsoup/soup-server.h \
	./usr/include/libsoup-2.4/libsoup/soup-logger.h \
	./usr/include/libsoup-2.4/libsoup/soup-proxy-resolver.h \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/libsoup-2.4.pc \
	./usr/include/libsoup-2.4/libsoup/soup-uri.h \
	./usr/include/libsoup-2.4/libsoup/soup-address.h \
	./usr/include/libsoup-2.4/libsoup/soup-tld.h \
	./usr/include/libsoup-2.4/libsoup/soup-auth-domain-digest.h \
	./usr/include/libsoup-2.4/libsoup/soup-content-decoder.h \
	./usr/include/libsoup-2.4/libsoup/soup-request-data.h \
	./usr/include/libsoup-2.4/libsoup/soup-cookie-jar-text.h \
	./usr/include/libsoup-2.4/libsoup/soup-proxy-uri-resolver.h \
	./usr/include/libsoup-2.4/libsoup/soup-cookie.h \
	./usr/include/libsoup-2.4/libsoup/soup-session-async.h \
	./usr/share/doc/libsoup2.4-dev/AUTHORS \
	./usr/include/libsoup-2.4/libsoup/soup-version.h \
	./usr/include/libsoup-2.4/libsoup/soup-auth-domain-basic.h \
	./usr/include/libsoup-2.4/libsoup/soup-message-body.h \
	./usr/include/libsoup-2.4/libsoup/soup-enum-types.h \
	./usr/include/libsoup-2.4/libsoup/soup-status.h \
	./usr/share/doc/libsoup2.4-dev/README \
	./usr/include/libsoup-2.4/libsoup/soup-requester.h \
	./usr/include/libsoup-2.4/libsoup/soup-misc.h \
	./usr/include/libsoup-2.4/libsoup/soup-types.h\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
