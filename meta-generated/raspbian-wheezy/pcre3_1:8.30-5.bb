PACKAGES = "libpcre3 libpcre3-dev libpcrecpp0"
PROVIDES = "libpcre3 libpcre3-dev libpcrecpp0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/pcre3/libpcre3_8.30-5_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/p/pcre3/libpcre3-dev_8.30-5_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/p/pcre3/libpcrecpp0_8.30-5_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_libpcre3 = "libpcre3_8.30-5_armhf.deb"
SRC_URI[deb0.sha256sum] = "bcef150256687180b95e0b8eb489f910871bc6bd287e833a016062efb952cfd2"
SRC_URI[deb0.md5sum] = "2e853b7d7962fba41b6a399c41f28742"
DEBFILENAME_libpcre3-dev = "libpcre3-dev_8.30-5_armhf.deb"
SRC_URI[deb1.sha256sum] = "6c2b10fb15200b9cebf077ea2bfee2762af79a04f9f50369b13633be1d62db59"
SRC_URI[deb1.md5sum] = "ee63e7f5bee6134fac5be83f1959dea6"
DEBFILENAME_libpcrecpp0 = "libpcrecpp0_8.30-5_armhf.deb"
SRC_URI[deb2.sha256sum] = "1a29155830efd68a924ad66f2f763420f7c402f4c6deb2ba62e22214d25e8361"
SRC_URI[deb2.md5sum] = "c1a420bfb43350308841b397cf1b75ac"

RDEPENDS_lib${PN} = "libc6 (>= 2.13-28)"
RDEPENDS_lib${PN}-dev = "libc6-dev libpcre3 (= 1:8.30-5) libpcrecpp0 (= 1:8.30-5)"
RDEPENDS_libpcrecpp0 = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0) libpcre3 (>= 8.10) libstdc++6 (>= 4.4.0)"
DEPENDS = "libgcc1 libc6 libc6-dev libstdc++6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libpcre3 = " \
	./usr/share/doc/libpcre3/copyright \
	./usr/share/man/man3/pcrepattern.3.gz \
	./usr/share/doc/libpcre3/AUTHORS \
	./usr/share/doc/libpcre3/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libpcreposix.so.3.13.1 \
	./lib/arm-linux-gnueabihf/libpcre.so.3 \
	./usr/share/doc/libpcre3/NEWS.gz \
	./lib/arm-linux-gnueabihf/libpcre.so.3.13.1 \
	./usr/share/doc/libpcre3/README.gz \
	./usr/share/doc/libpcre3/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/libpcreposix.so.3 \
	./usr/share/doc/libpcre3/README.Debian\
"
FILES_libpcre3-dev = " \
	./usr/lib/arm-linux-gnueabihf/libpcreposix.so \
	./usr/share/man/man3/pcre16_free_substring.3.gz \
	./usr/share/man/man3/pcre16_get_stringtable_entries.3.gz \
	./usr/share/man/man3/pcrejit.3.gz \
	./usr/lib/arm-linux-gnueabihf/libpcrecpp.a \
	./usr/share/man/man3/pcre16_free_substring_list.3.gz \
	./usr/share/man/man3/pcrebuild.3.gz \
	./usr/share/man/man3/pcre_dfa_exec.3.gz \
	./usr/share/man/man3/pcre16_fullinfo.3.gz \
	./usr/share/man/man3/pcre16_refcount.3.gz \
	./usr/share/man/man3/pcre16_get_substring.3.gz \
	./usr/share/man/man3/pcre_maketables.3.gz \
	./usr/share/doc/libpcre3-dev/changelog.Debian.gz \
	./usr/share/man/man3/pcre16_copy_substring.3.gz \
	./usr/share/man/man3/pcre16_pattern_to_host_byte_order.3.gz \
	./usr/share/man/man3/pcreprecompile.3.gz \
	./usr/share/man/man3/pcre_config.3.gz \
	./usr/share/man/man3/pcre16_version.3.gz \
	./usr/share/man/man3/pcre_pattern_to_host_byte_order.3.gz \
	./usr/share/man/man3/pcre16_utf16_to_host_byte_order.3.gz \
	./usr/share/man/man3/pcre16_exec.3.gz \
	./usr/share/man/man3/pcrestack.3.gz \
	./usr/share/man/man3/pcre_free_substring.3.gz \
	./usr/share/man/man3/pcre16_get_stringnumber.3.gz \
	./usr/share/man/man3/pcre16_assign_jit_stack.3.gz \
	./usr/share/man/man3/pcresample.3.gz \
	./usr/share/man/man3/pcre16_jit_stack_free.3.gz \
	./usr/share/man/man3/pcre16_study.3.gz \
	./usr/share/doc/libpcre3-dev/changelog.gz \
	./usr/share/man/man3/pcre_get_substring.3.gz \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/libpcreposix.pc \
	./usr/share/man/man3/pcre_fullinfo.3.gz \
	./usr/share/man/man3/pcre16_free_study.3.gz \
	./usr/include/pcre_stringpiece.h \
	./usr/share/man/man3/pcrematching.3.gz \
	./usr/share/man/man3/pcrecpp.3.gz \
	./usr/share/man/man3/pcresyntax.3.gz \
	./usr/share/man/man3/pcre_get_stringtable_entries.3.gz \
	./usr/share/man/man3/pcre_compile.3.gz \
	./usr/share/man/man3/pcre16_maketables.3.gz \
	./usr/share/man/man3/pcre_exec.3.gz \
	./usr/include/pcrecpp.h \
	./usr/share/man/man3/pcreperform.3.gz \
	./usr/include/pcre.h \
	./usr/share/man/man3/pcre_refcount.3.gz \
	./usr/share/man/man3/pcre_free_substring_list.3.gz \
	./usr/share/man/man3/pcre_assign_jit_stack.3.gz \
	./usr/share/man/man3/pcreunicode.3.gz \
	./usr/share/man/man3/pcreapi.3.gz \
	./usr/share/man/man3/pcre.3.gz \
	./usr/share/doc/libpcre3-dev/copyright \
	./usr/lib/arm-linux-gnueabihf/libpcre.a \
	./usr/include/pcreposix.h \
	./usr/share/man/man3/pcre16.3.gz \
	./usr/lib/arm-linux-gnueabihf/libpcrecpp.so \
	./usr/share/man/man3/pcre_copy_substring.3.gz \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/libpcre.pc \
	./usr/share/man/man3/pcre16_copy_named_substring.3.gz \
	./usr/share/man/man3/pcre_get_named_substring.3.gz \
	./usr/share/man/man3/pcre_free_study.3.gz \
	./usr/bin/pcre-config \
	./usr/share/man/man3/pcre_get_stringnumber.3.gz \
	./usr/lib/arm-linux-gnueabihf/libpcreposix.a \
	./usr/share/man/man3/pcre16_jit_stack_alloc.3.gz \
	./usr/share/man/man3/pcre16_get_named_substring.3.gz \
	./usr/share/man/man3/pcre_jit_stack_free.3.gz \
	./usr/include/pcrecpparg.h \
	./usr/share/man/man3/pcre_jit_stack_alloc.3.gz \
	./usr/share/man/man3/pcre_compile2.3.gz \
	./usr/share/man/man3/pcrepartial.3.gz \
	./usr/share/man/man3/pcre16_compile.3.gz \
	./usr/share/man/man3/pcre16_config.3.gz \
	./usr/share/man/man3/pcre16_get_substring_list.3.gz \
	./usr/share/man/man3/pcre_utf16_to_host_byte_order.3.gz \
	./usr/share/man/man3/pcreposix.3.gz \
	./usr/share/man/man3/pcre_version.3.gz \
	./usr/share/man/man3/pcre_get_substring_list.3.gz \
	./usr/share/man/man3/pcrecompat.3.gz \
	./usr/share/man/man3/pcre_study.3.gz \
	./usr/share/man/man3/pcre16_dfa_exec.3.gz \
	./usr/share/man/man3/pcrecallout.3.gz \
	./usr/share/man/man3/pcrelimits.3.gz \
	./usr/share/man/man3/pcre16_compile2.3.gz \
	./usr/share/doc/libpcre3-dev/examples/pcredemo.c.gz \
	./usr/include/pcre_scanner.h \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/libpcrecpp.pc \
	./usr/share/man/man1/pcre-config.1.gz \
	./usr/share/man/man3/pcre_copy_named_substring.3.gz \
	./usr/lib/arm-linux-gnueabihf/libpcre.so\
"
FILES_libpcrecpp0 = " \
	./usr/lib/arm-linux-gnueabihf/libpcrecpp.so.0 \
	./usr/share/doc/libpcrecpp0/NEWS.gz \
	./usr/share/doc/libpcrecpp0/AUTHORS \
	./usr/share/doc/libpcrecpp0/README.gz \
	./usr/lib/arm-linux-gnueabihf/libpcrecpp.so.0.0.0 \
	./usr/share/doc/libpcrecpp0/changelog.gz \
	./usr/share/doc/libpcrecpp0/changelog.Debian.gz \
	./usr/share/doc/libpcrecpp0/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
