PACKAGES = "${PN} libpthread-stubs0-dev"
PROVIDES = "libpthread-stubs0-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libp/libpthread-stubs/libpthread-stubs0-dev_0.3-4_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libpthread-stubs0-dev = "libpthread-stubs0-dev_0.3-4_armhf.deb"
SRC_URI[deb0.sha256sum] = "af248e9c2841345c48ca9c46510f439a576148a6ba701adc64e86cd9798807c2"
SRC_URI[deb0.md5sum] = "af1da4dec1ae23d2b8edf3b1972f9220"

RDEPENDS_${PN}0-dev = ""

inherit deb_group

FILES_libpthread-stubs0-dev = " \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/pthread-stubs.pc \
    ./usr/share/doc/libpthread-stubs0-dev/README \
    ./usr/share/doc/libpthread-stubs0-dev/changelog.Debian.gz \
    ./usr/share/doc/libpthread-stubs0-dev/copyright\
"
