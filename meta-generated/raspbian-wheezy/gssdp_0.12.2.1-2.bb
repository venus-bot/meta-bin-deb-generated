PACKAGES = "gir1.2-gssdp-1.0 libgssdp-1.0-3 libgssdp-1.0-dev"
PROVIDES = "gir1.2-gssdp-1.0 libgssdp-1.0-3 libgssdp-1.0-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gssdp/gir1.2-gssdp-1.0_0.12.2.1-2_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/g/gssdp/libgssdp-1.0-3_0.12.2.1-2_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/g/gssdp/libgssdp-1.0-dev_0.12.2.1-2_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_gir1.2-gssdp-1.0 = "gir1.2-gssdp-1.0_0.12.2.1-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "75a6798dbe5dedb0d05151f0386e9014bd92bcba39f6a7b63516e2df6d6e063b"
SRC_URI[deb0.md5sum] = "1afd22974fef4c9c887dd9173416bba6"
DEBFILENAME_libgssdp-1.0-3 = "libgssdp-1.0-3_0.12.2.1-2_armhf.deb"
SRC_URI[deb1.sha256sum] = "1e28776aac252c2cb7c882247ed956b9f6b1208ab27e5beed52ff47208045d73"
SRC_URI[deb1.md5sum] = "72efb9d2231c8065f36f6285db28a849"
DEBFILENAME_libgssdp-1.0-dev = "libgssdp-1.0-dev_0.12.2.1-2_armhf.deb"
SRC_URI[deb2.sha256sum] = "08d83b7978472f8f83d9e79d289c27c81a9363dfb310e75e18e2cd9f8e04b7dc"
SRC_URI[deb2.md5sum] = "0297063bc2e0015f16d8a485f48be4e6"

RDEPENDS_gir1.2-${PN}-1.0 = "gir1.2-glib-2.0 libgssdp-1.0-3 (>= 0.12.0)"
RDEPENDS_lib${PN}-1.0-3 = "libc6 (>= 2.13-28) libglib2.0-0 (>= 2.22.0) libsoup2.4-1 (>= 2.26.1)"
RDEPENDS_lib${PN}-1.0-dev = "libgssdp-1.0-3 (= 0.12.2.1-2) gir1.2-gssdp-1.0 libsoup2.4-dev"
DEPENDS = "libglib2.0-0 gir1.2-glib-2.0 libc6 libsoup2.4-1 libsoup2.4-dev"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_gir1.2-gssdp-1.0 = " \
	./usr/share/doc/gir1.2-gssdp-1.0/changelog.Debian.gz \
	./usr/share/doc/gir1.2-gssdp-1.0/copyright \
	./usr/share/doc/gir1.2-gssdp-1.0/README \
	./usr/share/doc/gir1.2-gssdp-1.0/AUTHORS \
	./usr/share/doc/gir1.2-gssdp-1.0/NEWS.gz \
	./usr/lib/girepository-1.0/GSSDP-1.0.typelib\
"
FILES_libgssdp-1.0-3 = " \
	./usr/lib/libgssdp-1.0.so.3 \
	./usr/share/doc/libgssdp-1.0-3/changelog.Debian.gz \
	./usr/share/doc/libgssdp-1.0-3/README \
	./usr/share/doc/libgssdp-1.0-3/NEWS.gz \
	./usr/lib/libgssdp-1.0.so.3.0.0 \
	./usr/share/doc/libgssdp-1.0-3/AUTHORS \
	./usr/share/doc/libgssdp-1.0-3/copyright\
"
FILES_libgssdp-1.0-dev = " \
	./usr/include/gssdp-1.0/libgssdp/gssdp-client.h \
	./usr/lib/pkgconfig/gssdp-1.0.pc \
	./usr/share/vala/vapi/gssdp-1.0.deps \
	./usr/share/vala/vapi/gssdp-1.0.vapi \
	./usr/include/gssdp-1.0/libgssdp/gssdp.h \
	./usr/share/doc/libgssdp-1.0-dev/changelog.Debian.gz \
	./usr/share/gir-1.0/GSSDP-1.0.gir \
	./usr/include/gssdp-1.0/libgssdp/gssdp-error.h \
	./usr/include/gssdp-1.0/libgssdp/gssdp-resource-group.h \
	./usr/lib/libgssdp-1.0.so \
	./usr/lib/libgssdp-1.0.a \
	./usr/share/doc/libgssdp-1.0-dev/NEWS.gz \
	./usr/share/doc/libgssdp-1.0-dev/AUTHORS \
	./usr/share/doc/libgssdp-1.0-dev/README \
	./usr/include/gssdp-1.0/libgssdp/gssdp-resource-browser.h \
	./usr/share/doc/libgssdp-1.0-dev/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
