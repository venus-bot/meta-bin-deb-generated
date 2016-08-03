PACKAGES = "libwrap0"
PROVIDES = "libwrap0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/t/tcp-wrappers/libwrap0_7.6.q-25_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libwrap0 = "libwrap0_7.6.q-25_armhf.deb"
SRC_URI[deb0.sha256sum] = "ba37ca05b7986875b3c9485de5afa49aecd65af6e1ebde2cb70cc283c973df35"
SRC_URI[deb0.md5sum] = "6870092de86101c134c4631faaf8b9af"

RDEPENDS_libwrap0 = "libc6 (>= 2.7)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libwrap0 = " \
	./usr/share/doc/libwrap0/changelog.gz \
	./lib/arm-linux-gnueabihf/libwrap.so.0 \
	./usr/share/man/man5/hosts_access.5.gz \
	./usr/share/man/man5/hosts_options.5.gz \
	./usr/share/man/man5/hosts.deny.5.gz \
	./usr/share/man/man5/hosts.allow.5.gz \
	./lib/arm-linux-gnueabihf/libwrap.so.0.7.6 \
	./usr/share/doc/libwrap0/README.gz \
	./usr/share/doc/libwrap0/copyright \
	./usr/share/doc/libwrap0/changelog.Debian.gz \
	./usr/share/doc/libwrap0/README.Debian\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
