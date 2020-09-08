PACKAGES = "${PN} libpthread-stubs0-dev"
PROVIDES = "libpthread-stubs0-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libp/libpthread-stubs/libpthread-stubs0-dev_0.4-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libpthread-stubs0-dev = "libpthread-stubs0-dev_0.4-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "296cbc4e83aa79186551dcd8dabafed34fc92eb376b425b93fc01b3aa02b9791"
SRC_URI[deb0.md5sum] = "6fd691c43731f77744cca7d0aeb0e666"

RDEPENDS_${PN}0-dev = ""

inherit deb_group

FILES_libpthread-stubs0-dev = " \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/pthread-stubs.pc \
    ./usr/share/doc/libpthread-stubs0-dev/README \
    ./usr/share/doc/libpthread-stubs0-dev/changelog.Debian.gz \
    ./usr/share/doc/libpthread-stubs0-dev/copyright\
"
