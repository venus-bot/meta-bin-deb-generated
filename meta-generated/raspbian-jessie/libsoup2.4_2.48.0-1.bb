PACKAGES = "gir1.2-soup-2.4 libsoup-gnome2.4-1 libsoup2.4-1 libsoup2.4-dev"
PROVIDES = "gir1.2-soup-2.4 libsoup-gnome2.4-1 libsoup2.4-1 libsoup2.4-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libs/libsoup2.4/gir1.2-soup-2.4_2.48.0-1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libs/libsoup2.4/libsoup-gnome2.4-1_2.48.0-1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/libs/libsoup2.4/libsoup2.4-1_2.48.0-1_armhf.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/libs/libsoup2.4/libsoup2.4-dev_2.48.0-1_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_gir1.2-soup-2.4 = "gir1.2-soup-2.4_2.48.0-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "c53d0d40eb6242263e6958d0262727a8f0f138f7cbdc58f55ee76a99cdf6c5e0"
SRC_URI[deb0.md5sum] = "2789ac0d298f851d67926f232846355a"
DEBFILENAME_libsoup-gnome2.4-1 = "libsoup-gnome2.4-1_2.48.0-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "ccb202b31a9966b7aa0fadcc06490a626ef5515cbc920d2b7ddf72cf92670135"
SRC_URI[deb1.md5sum] = "bb43bc3621abb655e5caa83a90a54039"
DEBFILENAME_libsoup2.4-1 = "libsoup2.4-1_2.48.0-1_armhf.deb"
SRC_URI[deb2.sha256sum] = "e734f63ccfdc71f70bda5229fb5a9d86e416b743dd92d6773380e90f21506d99"
SRC_URI[deb2.md5sum] = "c6c5de5fd0400c5936d2d3ebe1af343d"
DEBFILENAME_libsoup2.4-dev = "libsoup2.4-dev_2.48.0-1_armhf.deb"
SRC_URI[deb3.sha256sum] = "4b95faee0f249d1d51add6eb4cf1aa4ac678624b6e623354123f5b2237ae1dc2"
SRC_URI[deb3.md5sum] = "30918cf8a6b072d8e5a15740cd602ded"

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
	./usr/include/libsoup-2.4/libsoup/soup-request.h \
	./usr/share/doc/libsoup2.4-dev/changelog.Debian.gz \
	./usr/include/libsoup-2.4/libsoup/soup-cookie-jar-db.h \
	./usr/share/doc/libsoup2.4-dev/NEWS.gz \
	./usr/include/libsoup-2.4/libsoup/soup-portability.h \
	./usr/include/libsoup-2.4/libsoup/soup.h \
	./usr/include/libsoup-2.4/libsoup/soup-date.h \
	./usr/include/libsoup-2.4/libsoup/soup-message-headers.h \
	./usr/share/gir-1.0/Soup-2.4.gir \
	./usr/include/libsoup-2.4/libsoup/soup-xmlrpc.h \
	./usr/lib/arm-linux-gnueabihf/libsoup-2.4.so \
	./usr/share/doc/libsoup2.4-dev/copyright \
	./usr/include/libsoup-2.4/libsoup/soup-message.h \
	./usr/include/libsoup-2.4/libsoup/soup-headers.h \
	./usr/include/libsoup-2.4/libsoup/soup-request-file.h \
	./usr/include/libsoup-2.4/libsoup/soup-proxy-resolver-default.h \
	./usr/include/libsoup-2.4/libsoup/soup-auth-domain.h \
	./usr/include/libsoup-2.4/libsoup/soup-request-http.h \
	./usr/include/libsoup-2.4/libsoup/soup-multipart-input-stream.h \
	./usr/include/libsoup-2.4/libsoup/soup-auth.h \
	./usr/include/libsoup-2.4/libsoup/soup-tld.h \
	./usr/include/libsoup-2.4/libsoup/soup-password-manager.h \
	./usr/include/libsoup-2.4/libsoup/soup-session-async.h \
	./usr/include/libsoup-2.4/libsoup/soup-message-body.h \
	./usr/include/libsoup-2.4/libsoup/soup-method.h \
	./usr/include/libsoup-2.4/libsoup/soup-value-utils.h \
	./usr/lib/arm-linux-gnueabihf/libsoup-2.4.a \
	./usr/include/libsoup-2.4/libsoup/soup-session.h \
	./usr/include/libsoup-2.4/libsoup/soup-auth-manager.h \
	./usr/include/libsoup-2.4/libsoup/soup-cache.h \
	./usr/include/libsoup-2.4/libsoup/soup-content-sniffer.h \
	./usr/include/libsoup-2.4/libsoup/soup-status.h \
	./usr/include/libsoup-2.4/libsoup/soup-server.h \
	./usr/include/libsoup-2.4/libsoup/soup-logger.h \
	./usr/include/libsoup-2.4/libsoup/soup-proxy-resolver.h \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/libsoup-2.4.pc \
	./usr/include/libsoup-2.4/libsoup/soup-uri.h \
	./usr/include/libsoup-2.4/libsoup/soup-address.h \
	./usr/include/libsoup-2.4/libsoup/soup-multipart.h \
	./usr/include/libsoup-2.4/libsoup/soup-session-sync.h \
	./usr/include/libsoup-2.4/libsoup/soup-auth-domain-digest.h \
	./usr/include/libsoup-2.4/libsoup/soup-content-decoder.h \
	./usr/include/libsoup-2.4/libsoup/soup-request-data.h \
	./usr/include/libsoup-2.4/libsoup/soup-cookie-jar-text.h \
	./usr/include/libsoup-2.4/libsoup/soup-proxy-uri-resolver.h \
	./usr/include/libsoup-2.4/libsoup/soup-cookie.h \
	./usr/share/doc/libsoup2.4-dev/AUTHORS \
	./usr/include/libsoup-2.4/libsoup/soup-version.h \
	./usr/include/libsoup-2.4/libsoup/soup-auth-domain-basic.h \
	./usr/include/libsoup-2.4/libsoup/soup-enum-types.h \
	./usr/include/libsoup-2.4/libsoup/soup-session-feature.h \
	./usr/include/libsoup-2.4/libsoup/soup-cookie-jar.h \
	./usr/share/doc/libsoup2.4-dev/README \
	./usr/include/libsoup-2.4/libsoup/soup-requester.h \
	./usr/include/libsoup-2.4/libsoup/soup-misc.h \
	./usr/include/libsoup-2.4/libsoup/soup-types.h\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
