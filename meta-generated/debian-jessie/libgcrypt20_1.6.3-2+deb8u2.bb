PACKAGES = "libgcrypt20"
PROVIDES = "libgcrypt20"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libg/libgcrypt20/libgcrypt20_1.6.3-2+deb8u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgcrypt20 = "libgcrypt20_1.6.3-2+deb8u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "2e0399303413908f78e631fa82a49c6181bc9681676b3029fcf53453c022c467"
SRC_URI[deb0.md5sum] = "e4fa4b5821ac99e7ca7f48f39d3e0ad5"

RDEPENDS_${PN} = "libc6 (>= 2.15) libgpg-error0 (>= 1.14)"
DEPENDS = "libgpg-error0 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/doc/libgcrypt20/NEWS.gz \
	./usr/share/doc/libgcrypt20/README.gz \
	./usr/share/doc/libgcrypt20/changelog.gz \
	./lib/arm-linux-gnueabihf/libgcrypt.so.20 \
	./usr/share/doc/libgcrypt20/AUTHORS.gz \
	./usr/share/doc/libgcrypt20/copyright \
	./usr/share/doc/libgcrypt20/changelog.Debian.gz \
	./usr/share/doc/libgcrypt20/THANKS.gz \
	./lib/arm-linux-gnueabihf/libgcrypt.so.20.0.3\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
