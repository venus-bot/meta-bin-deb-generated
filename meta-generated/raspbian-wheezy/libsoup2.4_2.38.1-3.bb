PACKAGES = "gir1.2-soup-2.4 libsoup-gnome2.4-1 libsoup2.4-1 libsoup2.4-dev"
PROVIDES = "gir1.2-soup-2.4 libsoup-gnome2.4-1 libsoup2.4-1 libsoup2.4-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libs/libsoup2.4/gir1.2-soup-2.4_2.38.1-3_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libs/libsoup2.4/libsoup-gnome2.4-1_2.38.1-3_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/libs/libsoup2.4/libsoup2.4-1_2.38.1-3_armhf.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/libs/libsoup2.4/libsoup2.4-dev_2.38.1-3_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_gir1.2-soup-2.4 = "gir1.2-soup-2.4_2.38.1-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "09ec54650c2c913edc03a7a3cbff7e7ea8ad038574093420beaf1d66bb3dae52"
SRC_URI[deb0.md5sum] = "3737f522f8f23df492f5feb3daaa4b83"
DEBFILENAME_libsoup-gnome2.4-1 = "libsoup-gnome2.4-1_2.38.1-3_armhf.deb"
SRC_URI[deb1.sha256sum] = "31b4416bcfb991180e3572df81e740fd0280223a5b3923f55a62a8002cfd7ea2"
SRC_URI[deb1.md5sum] = "b99da10f8144767f38556220b29731ad"
DEBFILENAME_libsoup2.4-1 = "libsoup2.4-1_2.38.1-3_armhf.deb"
SRC_URI[deb2.sha256sum] = "dbe5d0e757a225140dd110aea386ce63c4531afc872c57ebe9b79f78862c3947"
SRC_URI[deb2.md5sum] = "067c1e3d6d77a9170131f76defeac45d"
DEBFILENAME_libsoup2.4-dev = "libsoup2.4-dev_2.38.1-3_armhf.deb"
SRC_URI[deb3.sha256sum] = "e02fae62329a0229b5f6e9852f88b7ec8ce066648e96d4789a0b972d0ffad37b"
SRC_URI[deb3.md5sum] = "6d92e018dcb7de0b4bbce9da929f61e3"

RDEPENDS_gir1.2-soup-2.4 = "gir1.2-glib-2.0 libsoup-gnome2.4-1 (>= 2.27.4) libsoup2.4-1 (>= 2.37.92)"
RDEPENDS_libsoup-gnome2.4-1 = "libc6 (>= 2.13-28) libglib2.0-0 (>= 2.31.7) libgnome-keyring0 (>= 2.20.3) libsoup2.4-1 (>= 2.33.92) libsqlite3-0 (>= 3.5.9) libxml2 (>= 2.6.27) zlib1g (>= 1:1.1.4)"
RDEPENDS_${PN}-1 = "libc6 (>= 2.13-28) libglib2.0-0 (>= 2.31.8) libxml2 (>= 2.7.4) zlib1g (>= 1:1.1.4) glib-networking (>= 2.32.0)"
RDEPENDS_${PN}-dev = "libsoup2.4-1 (= 2.38.1-3) gir1.2-soup-2.4 (= 2.38.1-3) libglib2.0-dev (>= 2.31.7) libxml2-dev"
DEPENDS = "libglib2.0-0 glib-networking libgnome-keyring0 libxml2 gir1.2-glib-2.0 libxml2-dev libsqlite3-0 zlib1g libc6 libglib2.0-dev"


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
	./usr/lib/arm-linux-gnueabihf/libsoup-gnome-2.4.so.1.5.0 \
	./usr/share/doc/libsoup-gnome2.4-1/changelog.Debian.gz \
	./usr/share/doc/libsoup-gnome2.4-1/AUTHORS \
	./usr/share/doc/libsoup-gnome2.4-1/NEWS.gz \
	./usr/lib/arm-linux-gnueabihf/libsoup-gnome-2.4.so.1 \
	./usr/share/doc/libsoup-gnome2.4-1/README \
	./usr/share/doc/libsoup-gnome2.4-1/copyright\
"
FILES_libsoup2.4-1 = " \
	./usr/share/doc/libsoup2.4-1/NEWS.gz \
	./usr/share/doc/libsoup2.4-1/changelog.Debian.gz \
	./usr/share/doc/libsoup2.4-1/README \
	./usr/lib/arm-linux-gnueabihf/libsoup-2.4.so.1 \
	./usr/lib/arm-linux-gnueabihf/libsoup-2.4.so.1.5.0 \
	./usr/share/doc/libsoup2.4-1/AUTHORS \
	./usr/share/doc/libsoup2.4-1/copyright\
"
FILES_${PN}-dev = " \
	./usr/include/libsoup-2.4/libsoup/soup-form.h \
	./usr/include/libsoup-2.4/libsoup/soup-socket.h \
	./usr/share/doc/libsoup2.4-dev/NEWS.gz \
	./usr/include/libsoup-2.4/libsoup/soup-request-http.h \
	./usr/share/doc/libsoup2.4-dev/changelog.Debian.gz \
	./usr/include/libsoup-2.4/libsoup/soup-message-headers.h \
	./usr/include/libsoup-2.4/libsoup/soup-portability.h \
	./usr/include/libsoup-2.4/libsoup/soup.h \
	./usr/include/libsoup-2.4/libsoup/soup-date.h \
	./usr/share/gir-1.0/Soup-2.4.gir \
	./usr/include/libsoup-2.4/libsoup/soup-request.h \
	./usr/include/libsoup-2.4/libsoup/soup-xmlrpc.h \
	./usr/lib/arm-linux-gnueabihf/libsoup-2.4.so \
	./usr/lib/arm-linux-gnueabihf/libsoup-2.4.a \
	./usr/include/libsoup-2.4/libsoup/soup-message.h \
	./usr/include/libsoup-2.4/libsoup/soup-headers.h \
	./usr/include/libsoup-2.4/libsoup/soup-request-file.h \
	./usr/include/libsoup-2.4/libsoup/soup-proxy-resolver-default.h \
	./usr/include/libsoup-2.4/libsoup/soup-auth-domain.h \
	./usr/include/libsoup-2.4/libsoup/soup-session-sync.h \
	./usr/share/doc/libsoup2.4-dev/copyright \
	./usr/include/libsoup-2.4/libsoup/soup-auth.h \
	./usr/include/libsoup-2.4/libsoup/soup-value-utils.h \
	./usr/include/libsoup-2.4/libsoup/soup-password-manager.h \
	./usr/include/libsoup-2.4/libsoup/soup-session-async.h \
	./usr/include/libsoup-2.4/libsoup/soup-message-body.h \
	./usr/include/libsoup-2.4/libsoup/soup-method.h \
	./usr/include/libsoup-2.4/libsoup/soup-session.h \
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
	./usr/include/libsoup-2.4/libsoup/soup-auth-domain-digest.h \
	./usr/include/libsoup-2.4/libsoup/soup-content-decoder.h \
	./usr/include/libsoup-2.4/libsoup/soup-request-data.h \
	./usr/include/libsoup-2.4/libsoup/soup-cookie-jar-text.h \
	./usr/include/libsoup-2.4/libsoup/soup-proxy-uri-resolver.h \
	./usr/include/libsoup-2.4/libsoup/soup-cookie.h \
	./usr/share/doc/libsoup2.4-dev/AUTHORS \
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
